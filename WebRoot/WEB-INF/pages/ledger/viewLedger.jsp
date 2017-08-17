<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.ledger-resources"/>
<html>
<head>
<title>View <fmt:message key="ledger.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="ledger.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexLedger"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="ledger.id.title"/>:
						</td>
						<td>
							${ledger.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="ledger.issueddate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${ledger.issuedDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="ledger.amount.title"/>:
						</td>
						<td>
							${ledger.amount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="ledger.validcode.title"/>:
						</td>
						<td>
							${ledger.validCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="ledger.type.title"/>:
						</td>
						<td>
							${ledger.type}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="ledger.filepath.title"/>:
						</td>
						<td>
							${ledger.filePath}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="ledger.createddate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${ledger.createdDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="ledger.modifieddate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${ledger.modifiedDate.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="comapny.title"/></h1>
					
						<c:if test='${ledger.comapny != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="comapny.companyid.title"/>:
						</td>
						<td>
							${ledger.comapny.companyId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="comapny.code.title"/>:
						</td>
						<td>
							${ledger.comapny.code}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="comapny.name.title"/>:
						</td>
						<td>
							${ledger.comapny.name}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="comapny.description.title"/>:
						</td>
						<td>
							${ledger.comapny.description}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="comapny.createddate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${ledger.comapny.createdDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="comapny.modifieddate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${ledger.comapny.modifiedDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="comapny.isactive.title"/>:
						</td>
						<td>
							${ledger.comapny.isActive}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editLedgerComapny?ledger_id=${ledger.id}&comapny_companyId=${ledger.comapny.companyId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteLedgerComapny?ledger_id=${ledger.id}&related_comapny_companyId=${ledger.comapny.companyId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${ledger.comapny == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newLedgerComapny?ledger_id=${ledger.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="comapny.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="accountreceivable.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newLedgerAccountReceivables?ledger_id=${ledger.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="accountreceivable.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="accountreceivable.id.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.inpt.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.month.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.customername.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.invoiceno.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.contractno.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.originalcurrency.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.vattype.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.excludegstamount.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.gst.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.includegstamount.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.invexrate.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.invvndamount.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.correspodingaccname.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.classcode.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.voucherno.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.receiptdate.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.receiptoriginalcurrencyamount.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.receiptexrate.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.receiptvndamount.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.fxlossgain.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.remainvn.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.correspondingaccno.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.description.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.createddate.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.modifieddate.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.validcode.title"/></th>
						<th class="thead"><fmt:message key="accountreceivable.filepath.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${ledger.accountReceivables}" var="current"  varStatus="i">	
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
					    		<c:set var="rowclass" value="rowtwo"/>
							</c:when>
							<c:otherwise>
					    		<c:set var="rowclass" value="rowone"/>
							</c:otherwise>
						</c:choose>
					<tr class="${rowclass}">
						<td nowrap="nowrap">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectLedgerAccountReceivables?ledger_id=${ledger.id}&accountreceivables_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editLedgerAccountReceivables?ledger_id=${ledger.id}&accountreceivables_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteLedgerAccountReceivables?ledger_id=${ledger.id}&related_accountreceivables_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.id}
						&nbsp;
						</td>
						<td>
							${current.inpt}
						&nbsp;
						</td>
						<td>
							${current.month}
						&nbsp;
						</td>
						<td>
							${current.customerName}
						&nbsp;
						</td>
						<td>
							${current.invoiceNo}
						&nbsp;
						</td>
						<td>
							${current.contractNo}
						&nbsp;
						</td>
						<td>
							${current.originalCurrency}
						&nbsp;
						</td>
						<td>
							${current.vatType}
						&nbsp;
						</td>
						<td>
							${current.excludeGstAmount}
						&nbsp;
						</td>
						<td>
							${current.gst}
						&nbsp;
						</td>
						<td>
							${current.includeGstAmount}
						&nbsp;
						</td>
						<td>
							${current.invExRate}
						&nbsp;
						</td>
						<td>
							${current.invVndAmount}
						&nbsp;
						</td>
						<td>
							${current.correspodingAccName}
						&nbsp;
						</td>
						<td>
							${current.classCode}
						&nbsp;
						</td>
						<td>
							${current.voucherNo}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.receiptDate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.receiptOriginalCurrencyAmount}
						&nbsp;
						</td>
						<td>
							${current.receiptExRate}
						&nbsp;
						</td>
						<td>
							${current.receiptVndAmount}
						&nbsp;
						</td>
						<td>
							${current.fxLossGain}
						&nbsp;
						</td>
						<td>
							${current.remainVn}
						&nbsp;
						</td>
						<td>
							${current.correspondingAccNo}
						&nbsp;
						</td>
						<td>
							${current.description}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.createdDate.time}"/>
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.modifiedDate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.validCode}
						&nbsp;
						</td>
						<td>
							${current.filePath}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="accountpayable.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newLedgerAccountPayables?ledger_id=${ledger.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="accountpayable.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="accountpayable.id.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.inpt.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.voucherno.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.pono.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.month.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.vendorname.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.vendortype.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.claimtype.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.invoiceno.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.correspondingaccname.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.correspondingaccno.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.correspondingacctype.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.class_.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.classcode.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.description.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.originalcurrency.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.vattype.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.excludegstamount.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.gst.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.includegstamount.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.invexrate.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.invvndamount.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.pvno.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.bankref.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.paiddate.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.paidoriginalcurrencyamount.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.paidexrate.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.paidvnamount.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.fxlossgain.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.remainvn.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.approvalcode.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.settlementvoucherno.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.createddate.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.modifieddate.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.validcode.title"/></th>
						<th class="thead"><fmt:message key="accountpayable.filepath.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${ledger.accountPayables}" var="current"  varStatus="i">	
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
					    		<c:set var="rowclass" value="rowtwo"/>
							</c:when>
							<c:otherwise>
					    		<c:set var="rowclass" value="rowone"/>
							</c:otherwise>
						</c:choose>
					<tr class="${rowclass}">
						<td nowrap="nowrap">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectLedgerAccountPayables?ledger_id=${ledger.id}&accountpayables_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editLedgerAccountPayables?ledger_id=${ledger.id}&accountpayables_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteLedgerAccountPayables?ledger_id=${ledger.id}&related_accountpayables_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.id}
						&nbsp;
						</td>
						<td>
							${current.inpt}
						&nbsp;
						</td>
						<td>
							${current.voucherNo}
						&nbsp;
						</td>
						<td>
							${current.poNo}
						&nbsp;
						</td>
						<td>
							${current.month}
						&nbsp;
						</td>
						<td>
							${current.vendorName}
						&nbsp;
						</td>
						<td>
							${current.vendorType}
						&nbsp;
						</td>
						<td>
							${current.claimType}
						&nbsp;
						</td>
						<td>
							${current.invoiceNo}
						&nbsp;
						</td>
						<td>
							${current.correspondingAccName}
						&nbsp;
						</td>
						<td>
							${current.correspondingAccNo}
						&nbsp;
						</td>
						<td>
							${current.correspondingAccType}
						&nbsp;
						</td>
						<td>
							${current.class_}
						&nbsp;
						</td>
						<td>
							${current.classCode}
						&nbsp;
						</td>
						<td>
							${current.description}
						&nbsp;
						</td>
						<td>
							${current.originalCurrency}
						&nbsp;
						</td>
						<td>
							${current.vatType}
						&nbsp;
						</td>
						<td>
							${current.excludeGstAmount}
						&nbsp;
						</td>
						<td>
							${current.gst}
						&nbsp;
						</td>
						<td>
							${current.includeGstAmount}
						&nbsp;
						</td>
						<td>
							${current.invExRate}
						&nbsp;
						</td>
						<td>
							${current.invVndAmount}
						&nbsp;
						</td>
						<td>
							${current.pvNo}
						&nbsp;
						</td>
						<td>
							${current.bankRef}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.paidDate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.paidOriginalCurrencyAmount}
						&nbsp;
						</td>
						<td>
							${current.paidExRate}
						&nbsp;
						</td>
						<td>
							${current.paidVnAmount}
						&nbsp;
						</td>
						<td>
							${current.fxLossGain}
						&nbsp;
						</td>
						<td>
							${current.remainVn}
						&nbsp;
						</td>
						<td>
							${current.approvalCode}
						&nbsp;
						</td>
						<td>
							${current.settlementVoucherNo}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.createdDate.time}"/>
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.modifiedDate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.validCode}
						&nbsp;
						</td>
						<td>
							${current.filePath}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>