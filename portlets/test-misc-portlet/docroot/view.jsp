<%
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
%>

<%@ include file="/init.jsp" %>

This is the <strong>Sample Test Portlet</strong>. This was made to test some portlet features.

<br /><br />

<strong>Portlet Request:</strong> <a href="<portlet:renderURL><portlet:param name="jspPage" value="/portlet_request/attribute_sharing.jsp" /></portlet:renderURL>">Attribute Sharing</a> | <a href="<portlet:renderURL><portlet:param name="jspPage" value="/portlet_request/remote_user.jsp" /></portlet:renderURL>">Remote User</a>

<br /><br />

<strong>Portlet Response:</strong> <a href="<portlet:renderURL><portlet:param name="jspPage" value="/portlet_response/buffer_size.jsp" /></portlet:renderURL>">Buffer Size</a> | <a href="<portlet:resourceURL id="logo.png" />">Download File</a>

<br /><br />

<strong>Portlet Session:</strong> <a href="<portlet:renderURL><portlet:param name="jspPage" value="/portlet_session/attribute_sharing.jsp" /></portlet:renderURL>">Attribute Sharing</a>

<br /><br />

<strong>Servlet Request:</strong> <a href="<%= request.getContextPath() %>/servlet_request/remote_user.jsp">Remote User</a>

<br /><br />

<strong>Upload:</strong> <a href="<portlet:renderURL><portlet:param name="<%= ActionRequest.ACTION_NAME %>" value="uploadForm1" /><portlet:param name="jspPage" value="/upload/form.jsp" /></portlet:renderURL>">Form 1</a> | <a href="<portlet:renderURL><portlet:param name="<%= ActionRequest.ACTION_NAME %>" value="uploadForm2" /><portlet:param name="jspPage" value="/upload/form.jsp" /></portlet:renderURL>">Form 2</a> | <a href="<portlet:renderURL><portlet:param name="<%= ActionRequest.ACTION_NAME %>" value="uploadForm3" /><portlet:param name="jspPage" value="/upload/form.jsp" /></portlet:renderURL>">Form 3</a>