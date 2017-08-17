<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.accountpayable-resources"/>
<html>
<head>
<title>View <fmt:message key="accountpayable.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="accountpayable.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexAccountPayable"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.id.title"/>:
						</td>
						<td>
							${accountpayable.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.inpt.title"/>:
						</td>
						<td>
							${accountpayable.inpt}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.voucherno.title"/>:
						</td>
						<td>
							${accountpayable.voucherNo}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.pono.title"/>:
						</td>
						<td>
							${accountpayable.poNo}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.month.title"/>:
						</td>
						<td>
							${accountpayable.month}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.vendorname.title"/>:
						</td>
						<td>
							${accountpayable.vendorName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.vendortype.title"/>:
						</td>
						<td>
							${accountpayable.vendorType}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.claimtype.title"/>:
						</td>
						<td>
							${accountpayable.claimType}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.invoiceno.title"/>:
						</td>
						<td>
							${accountpayable.invoiceNo}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.correspondingaccname.title"/>:
						</td>
						<td>
							${accountpayable.correspondingAccName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.correspondingaccno.title"/>:
						</td>
						<td>
							${accountpayable.correspondingAccNo}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.correspondingacctype.title"/>:
						</td>
						<td>
							${accountpayable.correspondingAccType}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.class_.title"/>:
						</td>
						<td>
							${accountpayable.class_}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.classcode.title"/>:
						</td>
						<td>
							${accountpayable.classCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.description.title"/>:
						</td>
						<td>
							${accountpayable.description}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.originalcurrency.title"/>:
						</td>
						<td>
							${accountpayable.originalCurrency}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.vattype.title"/>:
						</td>
						<td>
							${accountpayable.vatType}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.excludegstamount.title"/>:
						</td>
						<td>
							${accountpayable.excludeGstAmount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.gst.title"/>:
						</td>
						<td>
							${accountpayable.gst}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.includegstamount.title"/>:
						</td>
						<td>
							${accountpayable.includeGstAmount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.invexrate.title"/>:
						</td>
						<td>
							${accountpayable.invExRate}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.invvndamount.title"/>:
						</td>
						<td>
							${accountpayable.invVndAmount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.pvno.title"/>:
						</td>
						<td>
							${accountpayable.pvNo}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.bankref.title"/>:
						</td>
						<td>
							${accountpayable.bankRef}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.paiddate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${accountpayable.paidDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.paidoriginalcurrencyamount.title"/>:
						</td>
						<td>
							${accountpayable.paidOriginalCurrencyAmount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.paidexrate.title"/>:
						</td>
						<td>
							${accountpayable.paidExRate}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.paidvnamount.title"/>:
						</td>
						<td>
							${accountpayable.paidVnAmount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.fxlossgain.title"/>:
						</td>
						<td>
							${accountpayable.fxLossGain}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.remainvn.title"/>:
						</td>
						<td>
							${accountpayable.remainVn}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.approvalcode.title"/>:
						</td>
						<td>
							${accountpayable.approvalCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.settlementvoucherno.title"/>:
						</td>
						<td>
							${accountpayable.settlementVoucherNo}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.createddate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${accountpayable.createdDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.modifieddate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${accountpayable.modifiedDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.validcode.title"/>:
						</td>
						<td>
							${accountpayable.validCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountpayable.filepath.title"/>:
						</td>
						<td>
							${accountpayable.filePath}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteAccountPayable?idKey=${accountpayable.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>