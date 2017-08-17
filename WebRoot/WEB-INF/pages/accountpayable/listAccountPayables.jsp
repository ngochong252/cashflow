<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.accountpayable-resources"/>
<html>
<head>
<title>List <fmt:message key="accountpayable.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="accountpayable.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newAccountPayable"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="accountpayable.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
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
				<c:forEach items="${accountpayables}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectAccountPayable?idKey=${current.id}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editAccountPayable?idKey=${current.id}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteAccountPayable?idKey=${current.id}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.id}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.inpt}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.voucherNo}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.poNo}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.month}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.vendorName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.vendorType}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.claimType}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.invoiceNo}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.correspondingAccName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.correspondingAccNo}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.correspondingAccType}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.class_}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.classCode}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.description}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.originalCurrency}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.vatType}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.excludeGstAmount}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.gst}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.includeGstAmount}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.invExRate}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.invVndAmount}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.pvNo}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.bankRef}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.paidDate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.paidOriginalCurrencyAmount}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.paidExRate}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.paidVnAmount}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.fxLossGain}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.remainVn}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.approvalCode}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.settlementVoucherNo}
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