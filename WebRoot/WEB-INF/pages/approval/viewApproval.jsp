<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.approval-resources"/>
<html>
<head>
<title>View <fmt:message key="approval.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="approval.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexApproval"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="approval.id.title"/>:
						</td>
						<td>
							${approval.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="approval.code.title"/>:
						</td>
						<td>
							${approval.code}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="approval.approvaldate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${approval.approvalDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="approval.bankingdescription.title"/>:
						</td>
						<td>
							${approval.bankingDescription}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="approval.debitamount.title"/>:
						</td>
						<td>
							${approval.debitAmount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="approval.creditamount.title"/>:
						</td>
						<td>
							${approval.creditAmount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="approval.balance.title"/>:
						</td>
						<td>
							${approval.balance}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="approval.ledgername.title"/>:
						</td>
						<td>
							${approval.ledgerName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="approval.ledgerdescription.title"/>:
						</td>
						<td>
							${approval.ledgerDescription}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="approval.invoicecode.title"/>:
						</td>
						<td>
							${approval.invoiceCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="approval.bankref.title"/>:
						</td>
						<td>
							${approval.bankRef}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="approval.legdertype.title"/>:
						</td>
						<td>
							${approval.legderType}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="approval.createddate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${approval.createdDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="approval.modifieddate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${approval.modifiedDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="approval.validcode.title"/>:
						</td>
						<td>
							${approval.validCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="approval.filepath.title"/>:
						</td>
						<td>
							${approval.filePath}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="comapny.title"/></h1>
					
						<c:if test='${approval.comapny != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="comapny.companyid.title"/>:
						</td>
						<td>
							${approval.comapny.companyId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="comapny.code.title"/>:
						</td>
						<td>
							${approval.comapny.code}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="comapny.name.title"/>:
						</td>
						<td>
							${approval.comapny.name}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="comapny.description.title"/>:
						</td>
						<td>
							${approval.comapny.description}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="comapny.createddate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${approval.comapny.createdDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="comapny.modifieddate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${approval.comapny.modifiedDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="comapny.isactive.title"/>:
						</td>
						<td>
							${approval.comapny.isActive}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editApprovalComapny?approval_id=${approval.id}&comapny_companyId=${approval.comapny.companyId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteApprovalComapny?approval_id=${approval.id}&related_comapny_companyId=${approval.comapny.companyId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${approval.comapny == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newApprovalComapny?approval_id=${approval.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="comapny.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>