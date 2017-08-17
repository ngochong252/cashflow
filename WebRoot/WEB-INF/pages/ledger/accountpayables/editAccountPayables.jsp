<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.ledger-resources"/>
<html>
<head>
<title>Edit <fmt:message key="ledger.title"/> <fmt:message key="accountpayable.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="accountpayable.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectLedger?idKey=${ledger_id}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveLedgerAccountPayables" method="POST" modelAttribute="accountpayable">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.id.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="accountpayable_id" path="id" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_id",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.id.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${accountpayable.id}
						&nbsp;
									<form:hidden id="accountpayable_id" path="id"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.inpt.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_inpt" path="inpt" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_inpt",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.inpt.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.voucherno.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_voucherNo" path="voucherNo" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_voucherNo",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.voucherno.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.pono.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_poNo" path="poNo" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_poNo",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.pono.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.month.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_month" path="month" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_month",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.month.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.vendorname.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_vendorName" path="vendorName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_vendorName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.vendorname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.vendortype.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_vendorType" path="vendorType" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_vendorType",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.vendortype.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.claimtype.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_claimType" path="claimType" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_claimType",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.claimtype.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.invoiceno.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_invoiceNo" path="invoiceNo" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_invoiceNo",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.invoiceno.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.correspondingaccname.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_correspondingAccName" path="correspondingAccName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_correspondingAccName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.correspondingaccname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.correspondingaccno.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_correspondingAccNo" path="correspondingAccNo" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_correspondingAccNo",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.correspondingaccno.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.correspondingacctype.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_correspondingAccType" path="correspondingAccType" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_correspondingAccType",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.correspondingacctype.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.class_.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_class_" path="class_" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_class_",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.class_.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.classcode.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_classCode" path="classCode" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_classCode",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.classcode.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.description.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_description" path="description" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_description",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.description.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.originalcurrency.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_originalCurrency" path="originalCurrency" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_originalCurrency",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.originalcurrency.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.vattype.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_vatType" path="vatType" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_vatType",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.vattype.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.excludegstamount.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_excludeGstAmount" path="excludeGstAmount" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_excludeGstAmount",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.excludegstamount.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.gst.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_gst" path="gst" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_gst",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.gst.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.includegstamount.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_includeGstAmount" path="includeGstAmount" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_includeGstAmount",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.includegstamount.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.invexrate.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_invExRate" path="invExRate" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_invExRate",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.invexrate.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.invvndamount.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_invVndAmount" path="invVndAmount" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_invVndAmount",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.invvndamount.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.pvno.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_pvNo" path="pvNo" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_pvNo",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.pvno.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.bankref.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_bankRef" path="bankRef" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_bankRef",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.bankref.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.paiddate.title"/>:
						</td>
						<td>
							<input id="accountpayable_paidDate" name="paidDate" type="text" value="<fmt:formatDate value="${accountpayable.paidDate.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_paidDate",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.paidoriginalcurrencyamount.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_paidOriginalCurrencyAmount" path="paidOriginalCurrencyAmount" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_paidOriginalCurrencyAmount",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.paidoriginalcurrencyamount.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.paidexrate.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_paidExRate" path="paidExRate" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_paidExRate",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.paidexrate.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.paidvnamount.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_paidVnAmount" path="paidVnAmount" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_paidVnAmount",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.paidvnamount.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.fxlossgain.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_fxLossGain" path="fxLossGain" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_fxLossGain",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.fxlossgain.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.remainvn.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_remainVn" path="remainVn" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_remainVn",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.remainvn.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.approvalcode.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_approvalCode" path="approvalCode" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_approvalCode",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.approvalcode.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.settlementvoucherno.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_settlementVoucherNo" path="settlementVoucherNo" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_settlementVoucherNo",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.settlementvoucherno.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.createddate.title"/>:
						</td>
						<td>
							<input id="accountpayable_createdDate" name="createdDate" type="text" value="<fmt:formatDate value="${accountpayable.createdDate.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_createdDate",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.modifieddate.title"/>:
						</td>
						<td>
							<input id="accountpayable_modifiedDate" name="modifiedDate" type="text" value="<fmt:formatDate value="${accountpayable.modifiedDate.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_modifiedDate",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.validcode.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_validCode" path="validCode" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_validCode",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.validcode.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.filepath.title"/>:
						</td>
						<td>
							<form:input id="accountpayable_filePath" path="filePath" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "accountpayable_filePath",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="accountpayable.filepath.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
				<input type="hidden" name="ledger_id" value="${ledger_id}" >
				
				
				
				
				
				
				
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
