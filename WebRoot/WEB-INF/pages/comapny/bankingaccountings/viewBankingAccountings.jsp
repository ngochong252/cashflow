<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.comapny-resources"/>
<html>
<head>
<title>View <fmt:message key="comapny.title"/> <fmt:message key="bankingaccounting.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="bankingaccounting.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectComapny?companyIdKey=${comapny_companyId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.id.title"/>:
						</td>
						<td>
							${bankingaccounting.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.transactiondate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${bankingaccounting.transactionDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.inoriginalcurrency.title"/>:
						</td>
						<td>
							${bankingaccounting.inOriginalCurrency}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.outoriginalcurrency.title"/>:
						</td>
						<td>
							${bankingaccounting.outOriginalCurrency}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.balanceoriginalcurrency.title"/>:
						</td>
						<td>
							${bankingaccounting.balanceOriginalCurrency}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.invnd.title"/>:
						</td>
						<td>
							${bankingaccounting.inVnd}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.outvnd.title"/>:
						</td>
						<td>
							${bankingaccounting.outVnd}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.balancevnd.title"/>:
						</td>
						<td>
							${bankingaccounting.balanceVnd}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.description.title"/>:
						</td>
						<td>
							${bankingaccounting.description}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.correspondingaccname.title"/>:
						</td>
						<td>
							${bankingaccounting.correspondingAccName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.voucherno.title"/>:
						</td>
						<td>
							${bankingaccounting.voucherNo}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.appovalcode.title"/>:
						</td>
						<td>
							${bankingaccounting.appovalCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.voucherdate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${bankingaccounting.voucherDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.vendorname.title"/>:
						</td>
						<td>
							${bankingaccounting.vendorName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.bankref.title"/>:
						</td>
						<td>
							${bankingaccounting.bankRef}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.correspondingaccno.title"/>:
						</td>
						<td>
							${bankingaccounting.correspondingAccNo}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.createddate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${bankingaccounting.createdDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.modifieddate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${bankingaccounting.modifiedDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.validcode.title"/>:
						</td>
						<td>
							${bankingaccounting.validCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bankingaccounting.filepath.title"/>:
						</td>
						<td>
							${bankingaccounting.filePath}
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
