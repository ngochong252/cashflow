<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.bankingaccounting-resources"/>
<html>
<head>
<title>List <fmt:message key="bankingaccounting.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="bankingaccounting.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newBankingAccounting"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="bankingaccounting.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
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
				<c:forEach items="${bankingaccountings}" var="current" varStatus="i">
					<c:choose>
						<c:when test="${(i.count) % 2 == 0}">
		    				<c:set var="rowclass" value="rowtwo"/>
						</c:when>
						<c:otherwise>
		    				<c:set var="rowclass" value="rowone"/>
						</c:otherwise>
					</c:choose>	
				<tr class="${rowclass}">
					<td nowrap="nowrap" class="tabletd">
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectBankingAccounting?idKey=${current.id}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editBankingAccounting?idKey=${current.id}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteBankingAccounting?idKey=${current.id}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.id}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.transactionDate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.inOriginalCurrency}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.outOriginalCurrency}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.balanceOriginalCurrency}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.inVnd}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.outVnd}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.balanceVnd}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.description}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.correspondingAccName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.voucherNo}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.appovalCode}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="date" value="${current.voucherDate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.vendorName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.bankRef}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.correspondingAccNo}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.createdDate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.modifiedDate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.validCode}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.filePath}
						&nbsp;
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>