<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.approval-resources"/>
<html>
<head>
<title>List <fmt:message key="approval.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="approval.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newApproval"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="approval.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
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
				<c:forEach items="${approvals}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectApproval?idKey=${current.id}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editApproval?idKey=${current.id}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteApproval?idKey=${current.id}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.id}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.code}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.approvalDate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.bankingDescription}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.debitAmount}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.creditAmount}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.balance}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.ledgerName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.ledgerDescription}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.invoiceCode}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.bankRef}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.legderType}
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