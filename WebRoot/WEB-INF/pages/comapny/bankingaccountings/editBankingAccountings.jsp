<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.comapny-resources"/>
<html>
<head>
<title>Edit <fmt:message key="comapny.title"/> <fmt:message key="bankingaccounting.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="bankingaccounting.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectComapny?companyIdKey=${comapny_companyId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveComapnyBankingAccountings" method="POST" modelAttribute="bankingaccounting">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.id.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="bankingaccounting_id" path="id" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "bankingaccounting_id",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="bankingaccounting.id.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${bankingaccounting.id}
						&nbsp;
									<form:hidden id="bankingaccounting_id" path="id"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.transactiondate.title"/>:
						</td>
						<td>
							<input id="bankingaccounting_transactionDate" name="transactionDate" type="text" value="<fmt:formatDate value="${bankingaccounting.transactionDate.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "bankingaccounting_transactionDate",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.inoriginalcurrency.title"/>:
						</td>
						<td>
							<form:input id="bankingaccounting_inOriginalCurrency" path="inOriginalCurrency" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "bankingaccounting_inOriginalCurrency",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="bankingaccounting.inoriginalcurrency.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.outoriginalcurrency.title"/>:
						</td>
						<td>
							<form:input id="bankingaccounting_outOriginalCurrency" path="outOriginalCurrency" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "bankingaccounting_outOriginalCurrency",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="bankingaccounting.outoriginalcurrency.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.balanceoriginalcurrency.title"/>:
						</td>
						<td>
							<form:input id="bankingaccounting_balanceOriginalCurrency" path="balanceOriginalCurrency" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "bankingaccounting_balanceOriginalCurrency",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="bankingaccounting.balanceoriginalcurrency.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.invnd.title"/>:
						</td>
						<td>
							<form:input id="bankingaccounting_inVnd" path="inVnd" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "bankingaccounting_inVnd",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="bankingaccounting.invnd.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.outvnd.title"/>:
						</td>
						<td>
							<form:input id="bankingaccounting_outVnd" path="outVnd" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "bankingaccounting_outVnd",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="bankingaccounting.outvnd.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.balancevnd.title"/>:
						</td>
						<td>
							<form:input id="bankingaccounting_balanceVnd" path="balanceVnd" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "bankingaccounting_balanceVnd",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="bankingaccounting.balancevnd.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.description.title"/>:
						</td>
						<td>
							<form:input id="bankingaccounting_description" path="description" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "bankingaccounting_description",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="bankingaccounting.description.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.correspondingaccname.title"/>:
						</td>
						<td>
							<form:input id="bankingaccounting_correspondingAccName" path="correspondingAccName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "bankingaccounting_correspondingAccName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="bankingaccounting.correspondingaccname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.voucherno.title"/>:
						</td>
						<td>
							<form:input id="bankingaccounting_voucherNo" path="voucherNo" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "bankingaccounting_voucherNo",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="bankingaccounting.voucherno.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.appovalcode.title"/>:
						</td>
						<td>
							<form:input id="bankingaccounting_appovalCode" path="appovalCode" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "bankingaccounting_appovalCode",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="bankingaccounting.appovalcode.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.voucherdate.title"/>:
						</td>
						<td>
							<input id="bankingaccounting_voucherDate" name="voucherDate" type="text" value="<fmt:formatDate value="${bankingaccounting.voucherDate.time}" pattern="yyyy-MM-dd"/>" dojoType="dijit.form.DateTextBox" constraints="{datePattern:'<fmt:message key="date.format"/>'}" trim="true" promptMessage="<fmt:message key="date.format" />" invalidMessage="<fmt:message key="date.format.invalid" /> <fmt:message key="date.format" />." style="width:300px;" />
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.vendorname.title"/>:
						</td>
						<td>
							<form:input id="bankingaccounting_vendorName" path="vendorName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "bankingaccounting_vendorName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="bankingaccounting.vendorname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.bankref.title"/>:
						</td>
						<td>
							<form:input id="bankingaccounting_bankRef" path="bankRef" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "bankingaccounting_bankRef",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="bankingaccounting.bankref.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.correspondingaccno.title"/>:
						</td>
						<td>
							<form:input id="bankingaccounting_correspondingAccNo" path="correspondingAccNo" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "bankingaccounting_correspondingAccNo",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="bankingaccounting.correspondingaccno.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.createddate.title"/>:
						</td>
						<td>
							<input id="bankingaccounting_createdDate" name="createdDate" type="text" value="<fmt:formatDate value="${bankingaccounting.createdDate.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "bankingaccounting_createdDate",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.modifieddate.title"/>:
						</td>
						<td>
							<input id="bankingaccounting_modifiedDate" name="modifiedDate" type="text" value="<fmt:formatDate value="${bankingaccounting.modifiedDate.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "bankingaccounting_modifiedDate",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.validcode.title"/>:
						</td>
						<td>
							<form:input id="bankingaccounting_validCode" path="validCode" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "bankingaccounting_validCode",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="bankingaccounting.validcode.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.filepath.title"/>:
						</td>
						<td>
							<form:input id="bankingaccounting_filePath" path="filePath" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "bankingaccounting_filePath",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="bankingaccounting.filepath.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
				<input type="hidden" name="comapny_companyId" value="${comapny_companyId}" >
				
				
				
				
				
				
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
