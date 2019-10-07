package com.opensource.techblog.springmvc.portlet1.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.opensource.techblog.springmvc.portlet1.service.ClpSerializer;
import com.opensource.techblog.springmvc.portlet1.service.ProductLocalServiceUtil;
import com.opensource.techblog.springmvc.portlet1.service.ProductServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            ProductLocalServiceUtil.clearService();

            ProductServiceUtil.clearService();
        }
    }
}
