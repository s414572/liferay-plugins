/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.samplestrutsliferay.servlet;

import java.io.IOException;

import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <a href="TestSessionServlet.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class TestSessionServlet extends HttpServlet {

	public void service(
			HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {

		HttpSession session = request.getSession();

		StringBuilder sb = new StringBuilder();

		// Remote User

		sb.append("<b>Remote User:</b><br /><br />");
		sb.append(request.getRemoteUser());
		sb.append("<br /><br />");

		// Session ID

		sb.append("<b>Session ID:</b><br /><br />");
		sb.append(request.getRequestedSessionId());
		sb.append("<br /><br />");

		// Servlet Session Attributes

		sb.append("<b>Servlet Session Attributes:</b><br /><br />");

		Enumeration enu = session.getAttributeNames();

		while (enu.hasMoreElements()) {
			String attrName = (String)enu.nextElement();

			Object attrValue = session.getAttribute(attrName);

			sb.append(attrName);
			sb.append("=");
			sb.append(attrValue);
			sb.append("<br />");
		}

		response.setContentType("text/html");

		response.getOutputStream().print(sb.toString());
		response.getOutputStream().flush();
	}

}