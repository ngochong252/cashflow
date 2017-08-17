<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.comapny-resources"/>
<html>
<head>
<title>View <fmt:message key="comapny.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="comapny.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexComapny"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="comapny.companyid.title"/>:
						</td>
						<td>
							${comapny.companyId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="comapny.code.title"/>:
						</td>
						<td>
							${comapny.code}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="comapny.name.title"/>:
						</td>
						<td>
							${comapny.name}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="comapny.description.title"/>:
						</td>
						<td>
							${comapny.description}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="comapny.createddate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${comapny.createdDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="comapny.modifieddate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${comapny.modifiedDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="comapny.isactive.title"/>:
						</td>
						<td>
							${comapny.isActive}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="approval.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newComapnyApprovals?comapny_companyId=${comapny.companyId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="approval.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="approval.id.title"/></th>
						<th class="thead"><fmt:message key="approval.code.title"/></th>
						<th class="thead"><fmt:message key="approval.approvaldate.title"/></th>
						<th class="thead"><fmt:message key="approval.bankingdescription.title"/></th>
						<th class="thead"><fmt:message key="approval.debitamount.title"/></th>
						<th class="thead"><fmt:message key="approval.creditamount.title"/></th>
						<th class="thead"><fmt:message key="approval.balance.title"/></th>
						<th class="thead"><fmt:message key="approval.ledgername.title"/></th>
						<th class="thead"><fmt:message key="approval.ledgerdescription.title"/></th>
						<th class="thead"><fmt:message key="approval.invoicecode.title"/></th>
						<th class="thead"><fmt:message key="approval.bankref.title"/></th>
						<th class="thead"><fmt:message key="approval.legdertype.title"/></th>
						<th class="thead"><fmt:message key="approval.createddate.title"/></th>
						<th class="thead"><fmt:message key="approval.modifieddate.title"/></th>
						<th class="thead"><fmt:message key="approval.validcode.title"/></th>
						<th class="thead"><fmt:message key="approval.filepath.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${comapny.approvals}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectComapnyApprovals?comapny_companyId=${comapny.companyId}&approvals_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editComapnyApprovals?comapny_companyId=${comapny.companyId}&approvals_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteComapnyApprovals?comapny_companyId=${comapny.companyId}&related_approvals_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.id}
						&nbsp;
						</td>
						<td>
							${current.code}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.approvalDate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.bankingDescription}
						&nbsp;
						</td>
						<td>
							${current.debitAmount}
						&nbsp;
						</td>
						<td>
							${current.creditAmount}
						&nbsp;
						</td>
						<td>
							${current.balance}
						&nbsp;
						</td>
						<td>
							${current.ledgerName}
						&nbsp;
						</td>
						<td>
							${current.ledgerDescription}
						&nbsp;
						</td>
						<td>
							${current.invoiceCode}
						&nbsp;
						</td>
						<td>
							${current.bankRef}
						&nbsp;
						</td>
						<td>
							${current.legderType}
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
			<h1><fmt:message key="bankingaccounting.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newComapnyBankingAccountings?comapny_companyId=${comapny.companyId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="bankingaccounting.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="bankingaccounting.id.title"/></th>
						<th class="thead"><fmt:message key="bankingaccounting.transactiondate.title"/></th>
						<th class="thead"><fmt:message key="bankingaccounting.inoriginalcurrency.title"/></th>
						<th class="thead"><fmt:message key="bankingaccounting.outoriginalcurrency.title"/></th>
						<th class="thead"><fmt:message key="bankingaccounting.balanceoriginalcurrency.title"/></th>
						<th class="thead"><fmt:message key="bankingaccounting.invnd.title"/></th>
						<th class="thead"><fmt:message key="bankingaccounting.outvnd.title"/></th>
						<th class="thead"><fmt:message key="bankingaccounting.balancevnd.title"/></th>
						<th class="thead"><fmt:message key="bankingaccounting.description.title"/></th>
						<th class="thead"><fmt:message key="bankingaccounting.correspondingaccname.title"/></th>
						<th class="thead"><fmt:message key="bankingaccounting.voucherno.title"/></th>
						<th class="thead"><fmt:message key="bankingaccounting.appovalcode.title"/></th>
						<th class="thead"><fmt:message key="bankingaccounting.voucherdate.title"/></th>
						<th class="thead"><fmt:message key="bankingaccounting.vendorname.title"/></th>
						<th class="thead"><fmt:message key="bankingaccounting.bankref.title"/></th>
						<th class="thead"><fmt:message key="bankingaccounting.correspondingaccno.title"/></th>
						<th class="thead"><fmt:message key="bankingaccounting.createddate.title"/></th>
						<th class="thead"><fmt:message key="bankingaccounting.modifieddate.title"/></th>
						<th class="thead"><fmt:message key="bankingaccounting.validcode.title"/></th>
						<th class="thead"><fmt:message key="bankingaccounting.filepath.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${comapny.bankingAccountings}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectComapnyBankingAccountings?comapny_companyId=${comapny.companyId}&bankingaccountings_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editComapnyBankingAccountings?comapny_companyId=${comapny.companyId}&bankingaccountings_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteComapnyBankingAccountings?comapny_companyId=${comapny.companyId}&related_bankingaccountings_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.id}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.transactionDate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.inOriginalCurrency}
						&nbsp;
						</td>
						<td>
							${current.outOriginalCurrency}
						&nbsp;
						</td>
						<td>
							${current.balanceOriginalCurrency}
						&nbsp;
						</td>
						<td>
							${current.inVnd}
						&nbsp;
						</td>
						<td>
							${current.outVnd}
						&nbsp;
						</td>
						<td>
							${current.balanceVnd}
						&nbsp;
						</td>
						<td>
							${current.description}
						&nbsp;
						</td>
						<td>
							${current.correspondingAccName}
						&nbsp;
						</td>
						<td>
							${current.voucherNo}
						&nbsp;
						</td>
						<td>
							${current.appovalCode}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${current.voucherDate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.vendorName}
						&nbsp;
						</td>
						<td>
							${current.bankRef}
						&nbsp;
						</td>
						<td>
							${current.correspondingAccNo}
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
			<h1><fmt:message key="ledger.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newComapnyLedgers?comapny_companyId=${comapny.companyId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="ledger.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="ledger.id.title"/></th>
						<th class="thead"><fmt:message key="ledger.issueddate.title"/></th>
						<th class="thead"><fmt:message key="ledger.amount.title"/></th>
						<th class="thead"><fmt:message key="ledger.validcode.title"/></th>
						<th class="thead"><fmt:message key="ledger.type.title"/></th>
						<th class="thead"><fmt:message key="ledger.filepath.title"/></th>
						<th class="thead"><fmt:message key="ledger.createddate.title"/></th>
						<th class="thead"><fmt:message key="ledger.modifieddate.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${comapny.ledgers}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectComapnyLedgers?comapny_companyId=${comapny.companyId}&ledgers_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editComapnyLedgers?comapny_companyId=${comapny.companyId}&ledgers_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteComapnyLedgers?comapny_companyId=${comapny.companyId}&related_ledgers_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.id}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.issuedDate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.amount}
						&nbsp;
						</td>
						<td>
							${current.validCode}
						&nbsp;
						</td>
						<td>
							${current.type}
						&nbsp;
						</td>
						<td>
							${current.filePath}
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