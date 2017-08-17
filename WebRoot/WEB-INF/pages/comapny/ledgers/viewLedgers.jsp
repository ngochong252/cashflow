<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.comapny-resources"/>
<html>
<head>
<title>View <fmt:message key="comapny.title"/> <fmt:message key="ledger.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="ledger.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectComapny?companyIdKey=${comapny_companyId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
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
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
