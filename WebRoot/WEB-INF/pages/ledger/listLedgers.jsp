<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.ledger-resources"/>
<html>
<head>
<title>List <fmt:message key="ledger.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="ledger.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newLedger"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="ledger.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
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
				<c:forEach items="${ledgers}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectLedger?idKey=${current.id}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editLedger?idKey=${current.id}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteLedger?idKey=${current.id}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.id}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.issuedDate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.amount}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.validCode}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.type}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.filePath}
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