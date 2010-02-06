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

package com.liferay.socialnetworking.model;

/**
 * <a href="MeetupsRegistrationWrapper.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 */
public class MeetupsRegistrationWrapper implements MeetupsRegistration {
	public MeetupsRegistrationWrapper(MeetupsRegistration meetupsRegistration) {
		_meetupsRegistration = meetupsRegistration;
	}

	public long getPrimaryKey() {
		return _meetupsRegistration.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_meetupsRegistration.setPrimaryKey(pk);
	}

	public long getMeetupsRegistrationId() {
		return _meetupsRegistration.getMeetupsRegistrationId();
	}

	public void setMeetupsRegistrationId(long meetupsRegistrationId) {
		_meetupsRegistration.setMeetupsRegistrationId(meetupsRegistrationId);
	}

	public long getCompanyId() {
		return _meetupsRegistration.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_meetupsRegistration.setCompanyId(companyId);
	}

	public long getUserId() {
		return _meetupsRegistration.getUserId();
	}

	public void setUserId(long userId) {
		_meetupsRegistration.setUserId(userId);
	}

	public java.lang.String getUserUuid()
		throws com.liferay.portal.SystemException {
		return _meetupsRegistration.getUserUuid();
	}

	public void setUserUuid(java.lang.String userUuid) {
		_meetupsRegistration.setUserUuid(userUuid);
	}

	public java.lang.String getUserName() {
		return _meetupsRegistration.getUserName();
	}

	public void setUserName(java.lang.String userName) {
		_meetupsRegistration.setUserName(userName);
	}

	public java.util.Date getCreateDate() {
		return _meetupsRegistration.getCreateDate();
	}

	public void setCreateDate(java.util.Date createDate) {
		_meetupsRegistration.setCreateDate(createDate);
	}

	public java.util.Date getModifiedDate() {
		return _meetupsRegistration.getModifiedDate();
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		_meetupsRegistration.setModifiedDate(modifiedDate);
	}

	public long getMeetupsEntryId() {
		return _meetupsRegistration.getMeetupsEntryId();
	}

	public void setMeetupsEntryId(long meetupsEntryId) {
		_meetupsRegistration.setMeetupsEntryId(meetupsEntryId);
	}

	public int getStatus() {
		return _meetupsRegistration.getStatus();
	}

	public void setStatus(int status) {
		_meetupsRegistration.setStatus(status);
	}

	public java.lang.String getComments() {
		return _meetupsRegistration.getComments();
	}

	public void setComments(java.lang.String comments) {
		_meetupsRegistration.setComments(comments);
	}

	public com.liferay.socialnetworking.model.MeetupsRegistration toEscapedModel() {
		return _meetupsRegistration.toEscapedModel();
	}

	public boolean isNew() {
		return _meetupsRegistration.isNew();
	}

	public boolean setNew(boolean n) {
		return _meetupsRegistration.setNew(n);
	}

	public boolean isCachedModel() {
		return _meetupsRegistration.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_meetupsRegistration.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _meetupsRegistration.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_meetupsRegistration.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _meetupsRegistration.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _meetupsRegistration.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_meetupsRegistration.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _meetupsRegistration.clone();
	}

	public int compareTo(
		com.liferay.socialnetworking.model.MeetupsRegistration meetupsRegistration) {
		return _meetupsRegistration.compareTo(meetupsRegistration);
	}

	public int hashCode() {
		return _meetupsRegistration.hashCode();
	}

	public java.lang.String toString() {
		return _meetupsRegistration.toString();
	}

	public java.lang.String toXmlString() {
		return _meetupsRegistration.toXmlString();
	}

	public MeetupsRegistration getWrappedMeetupsRegistration() {
		return _meetupsRegistration;
	}

	private MeetupsRegistration _meetupsRegistration;
}