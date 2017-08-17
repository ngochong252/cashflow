<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.processcase-resources"/>
<html>
<head>
<title>View <fmt:message key="processcase.title"/> <fmt:message key="errordetails.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="errordetails.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectProcessCase?idKey=${processcase_id}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="errordetails.id.title"/>:
						</td>
						<td>
							${errordetails.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="errordetails.baid.title"/>:
						</td>
						<td>
							${errordetails.baId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="errordetails.ledgerid.title"/>:
						</td>
						<td>
							${errordetails.ledgerId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="errordetails.approvalid.title"/>:
						</td>
						<td>
							${errordetails.approvalId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="errordetails.status.title"/>:
						</td>
						<td>
							${errordetails.status}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="errordetails.description.title"/>:
						</td>
						<td>
							${errordetails.description}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteProcessCaseErrorDetails?processcase_id=${processcase_id}&related_errordetails_id=${errordetails.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
