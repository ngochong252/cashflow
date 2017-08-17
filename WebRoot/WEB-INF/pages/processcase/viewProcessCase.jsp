<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.processcase-resources"/>
<html>
<head>
<title>View <fmt:message key="processcase.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="processcase.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexProcessCase"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="processcase.id.title"/>:
						</td>
						<td>
							${processcase.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="processcase.stepsresolve.title"/>:
						</td>
						<td>
							${processcase.stepsResolve}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="errordetails.title"/></h1>
					
						<c:if test='${processcase.errorDetails != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="errordetails.id.title"/>:
						</td>
						<td>
							${processcase.errorDetails.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="errordetails.baid.title"/>:
						</td>
						<td>
							${processcase.errorDetails.baId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="errordetails.ledgerid.title"/>:
						</td>
						<td>
							${processcase.errorDetails.ledgerId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="errordetails.approvalid.title"/>:
						</td>
						<td>
							${processcase.errorDetails.approvalId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="errordetails.status.title"/>:
						</td>
						<td>
							${processcase.errorDetails.status}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="errordetails.description.title"/>:
						</td>
						<td>
							${processcase.errorDetails.description}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editProcessCaseErrorDetails?processcase_id=${processcase.id}&errordetails_id=${processcase.errorDetails.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteProcessCaseErrorDetails?processcase_id=${processcase.id}&related_errordetails_id=${processcase.errorDetails.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${processcase.errorDetails == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProcessCaseErrorDetails?processcase_id=${processcase.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="errordetails.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>