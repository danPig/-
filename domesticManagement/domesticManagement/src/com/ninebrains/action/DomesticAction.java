package com.ninebrains.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.ninebrains.domain.DomesticDomain;
import com.ninebrains.form.DomesticForm;
import com.ninebrains.service.IDomesticService;
import com.ninebrains.service.impl.DomesticServiceImpl;

public class DomesticAction extends Action {
        private IDomesticService domesticService=new DomesticServiceImpl();
        @Override
        public ActionForward execute(ActionMapping mapping, ActionForm form,
                        HttpServletRequest request, HttpServletResponse response)
                        throws Exception {
                DomesticForm domesticForm=(DomesticForm) form;
                String url="";
                int result=0;
                String message="";
                if("chang".equals(domesticForm.getUsername()) && "123".equals(domesticForm.getPassword())){
                        url="frame";
                        
                }
                if("add".equals(domesticForm.getOperate())){
                        result=domesticService.addStuff(domesticForm.getDomesticDomain());
                        if(result==1){
                               message="新增成功！";
                        }else{
                                message="新增失败！";
                        }
                        request.setAttribute("message", message);
                        url="test";
                }
                if("list".equals(domesticForm.getOperate())){
                        List<DomesticDomain> list=domesticService.selectAll();
                        request.setAttribute("list", list);
                        url="list";
                }
                if("edit".equals(domesticForm.getOperate())){
                        domesticForm.getDomesticDomain().setStuffid(domesticForm.getId());
                        DomesticDomain domesticDomain=domesticService.selectEdit(domesticForm.getDomesticDomain());
                        request.setAttribute("domesticDomain", domesticDomain);
                        url="edit";
                }
                if("update".equals(domesticForm.getOperate())){
                        result=domesticService.updateStuff(domesticForm.getDomesticDomain());
                        System.out.println(result);
                        if(result==1){
                                message="修改成功！";
                        }else{
                                message="修改失败！";
                        }
                        request.setAttribute("message", message);
                        url="test";
                }
                if("delete".equals(domesticForm.getOperate())){
                        domesticForm.getDomesticDomain().setStuffid(domesticForm.getId());
                        result=domesticService.deleteStuff(domesticForm.getDomesticDomain());
                        if(result==1){
                                message="删除成功！";
                        }else{
                                message="删除失败！";
                        }
                        request.setAttribute("message", message);
                        url="test";
                }
                if("query".equals(domesticForm.getOperate())){
                        List<DomesticDomain> list=domesticService.selectStuff(domesticForm.getDomesticDomain());
                        request.setAttribute("list", list);
                        url="list";
                }
                return mapping.findForward(url);
        }
        
}
