<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.ledger-resources"/>
<html>
<head>
<title>View <fmt:message key="ledger.title"/> <fmt:message key="accountreceivable.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="accountreceivable.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectLedger?idKey=${ledger_id}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.id.title"/>:
						</td>
						<td>
							${accountreceivable.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.inpt.title"/>:
						</td>
						<td>
							${accountreceivable.inpt}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.month.title"/>:
						</td>
						<td>
							${accountreceivable.month}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.customername.title"/>:
						</td>
						<td>
							${accountreceivable.customerName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.invoiceno.title"/>:
						</td>
						<td>
							${accountreceivable.invoiceNo}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.contractno.title"/>:
						</td>
						<td>
							${accountreceivable.contractNo}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.originalcurrency.title"/>:
						</td>
						<td>
							${accountreceivable.originalCurrency}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.vattype.title"/>:
						</td>
						<td>
							${accountreceivable.vatType}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.excludegstamount.title"/>:
						</td>
						<td>
							${accountreceivable.excludeGstAmount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.gst.title"/>:
						</td>
						<td>
							${accountreceivable.gst}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.includegstamount.title"/>:
						</td>
						<td>
							${accountreceivable.includeGstAmount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.invexrate.title"/>:
						</td>
						<td>
							${accountreceivable.invExRate}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.invvndamount.title"/>:
						</td>
						<td>
							${accountreceivable.invVndAmount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.correspodingaccname.title"/>:
						</td>
						<td>
							${accountreceivable.correspodingAccName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.classcode.title"/>:
						</td>
						<td>
							${accountreceivable.classCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.voucherno.title"/>:
						</td>
						<td>
							${accountreceivable.voucherNo}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.receiptdate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${accountreceivable.receiptDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.receiptoriginalcurrencyamount.title"/>:
						</td>
						<td>
							${accountreceivable.receiptOriginalCurrencyAmount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.receiptexrate.title"/>:
						</td>
						<td>
							${accountreceivable.receiptExRate}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.receiptvndamount.title"/>:
						</td>
						<td>
							${accountreceivable.receiptVndAmount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.fxlossgain.title"/>:
						</td>
						<td>
							${accountreceivable.fxLossGain}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.remainvn.title"/>:
						</td>
						<td>
							${accountreceivable.remainVn}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.correspondingaccno.title"/>:
						</td>
						<td>
							${accountreceivable.correspondingAccNo}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.description.title"/>:
						</td>
						<td>
							${accountreceivable.description}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.createddate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${accountreceivable.createdDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.modifieddate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${accountreceivable.modifiedDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.validcode.title"/>:
						</td>
						<td>
							${accountreceivable.validCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accountreceivable.filepath.title"/>:
						</td>
						<td>
							${accountreceivable.filePath}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteLedgerAccountReceivables?ledger_id=${ledger_id}&related_accountreceivables_id=${accountreceivable.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
