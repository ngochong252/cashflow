<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.accountreceivable-resources"/>
<html>
<head>
<title>Edit <fmt:message key="accountreceivable.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="accountreceivable.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexAccountReceivable"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveAccountReceivable" method="POST" modelAttribute="accountreceivable">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.id.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="accountreceivable_id" path="id" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_id",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.id.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${accountreceivable.id}
						&nbsp;
									<form:hidden id="accountreceivable_id" path="id"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.inpt.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_inpt" path="inpt" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_inpt",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.inpt.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.month.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_month" path="month" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_month",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.month.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.customername.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_customerName" path="customerName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_customerName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.customername.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.invoiceno.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_invoiceNo" path="invoiceNo" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_invoiceNo",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.invoiceno.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.contractno.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_contractNo" path="contractNo" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_contractNo",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.contractno.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.originalcurrency.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_originalCurrency" path="originalCurrency" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_originalCurrency",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.originalcurrency.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.vattype.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_vatType" path="vatType" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_vatType",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.vattype.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.excludegstamount.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_excludeGstAmount" path="excludeGstAmount" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_excludeGstAmount",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.excludegstamount.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.gst.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_gst" path="gst" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_gst",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.gst.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.includegstamount.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_includeGstAmount" path="includeGstAmount" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_includeGstAmount",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.includegstamount.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.invexrate.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_invExRate" path="invExRate" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_invExRate",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.invexrate.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.invvndamount.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_invVndAmount" path="invVndAmount" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_invVndAmount",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.invvndamount.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.correspodingaccname.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_correspodingAccName" path="correspodingAccName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_correspodingAccName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.correspodingaccname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.classcode.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_classCode" path="classCode" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_classCode",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.classcode.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.voucherno.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_voucherNo" path="voucherNo" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_voucherNo",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.voucherno.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.receiptdate.title"/>:
						</td>
						<td>
							<input id="accountreceivable_receiptDate" name="receiptDate" type="text" value="<fmt:formatDate value="${accountreceivable.receiptDate.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_receiptDate",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.receiptoriginalcurrencyamount.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_receiptOriginalCurrencyAmount" path="receiptOriginalCurrencyAmount" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_receiptOriginalCurrencyAmount",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.receiptoriginalcurrencyamount.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.receiptexrate.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_receiptExRate" path="receiptExRate" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_receiptExRate",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.receiptexrate.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.receiptvndamount.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_receiptVndAmount" path="receiptVndAmount" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_receiptVndAmount",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.receiptvndamount.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.fxlossgain.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_fxLossGain" path="fxLossGain" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_fxLossGain",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.fxlossgain.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.remainvn.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_remainVn" path="remainVn" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_remainVn",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.remainvn.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.correspondingaccno.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_correspondingAccNo" path="correspondingAccNo" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_correspondingAccNo",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.correspondingaccno.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.description.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_description" path="description" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_description",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.description.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.createddate.title"/>:
						</td>
						<td>
							<input id="accountreceivable_createdDate" name="createdDate" type="text" value="<fmt:formatDate value="${accountreceivable.createdDate.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_createdDate",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.modifieddate.title"/>:
						</td>
						<td>
							<input id="accountreceivable_modifiedDate" name="modifiedDate" type="text" value="<fmt:formatDate value="${accountreceivable.modifiedDate.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_modifiedDate",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.validcode.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_validCode" path="validCode" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_validCode",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.validcode.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.filepath.title"/>:
						</td>
						<td>
							<form:input id="accountreceivable_filePath" path="filePath" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountreceivable_filePath",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountreceivable.filepath.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>