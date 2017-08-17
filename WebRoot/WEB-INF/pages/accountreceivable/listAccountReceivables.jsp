<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.accountreceivable-resources"/>
<html>
<head>
<title>List <fmt:message key="accountreceivable.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="accountreceivable.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newAccountReceivable"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="accountreceivable.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="accountreceivable.id.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.inpt.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.month.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.customername.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.invoiceno.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.contractno.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.originalcurrency.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.vattype.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.excludegstamount.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.gst.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.includegstamount.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.invexrate.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.invvndamount.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.correspodingaccname.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.classcode.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.voucherno.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.receiptdate.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.receiptoriginalcurrencyamount.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.receiptexrate.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.receiptvndamount.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.fxlossgain.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.remainvn.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.correspondingaccno.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.description.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.createddate.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.modifieddate.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.validcode.title"/></th>
					<th class="thead"><fmt:message key="accountreceivable.filepath.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${accountreceivables}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectAccountReceivable?idKey=${current.id}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editAccountReceivable?idKey=${current.id}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteAccountReceivable?idKey=${current.id}&"><img src="images/icons/delete.gif" /></a>
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
						
							${current.month}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.customerName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.invoiceNo}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.contractNo}
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
						
							${current.correspodingAccName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.classCode}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.voucherNo}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.receiptDate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.receiptOriginalCurrencyAmount}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.receiptExRate}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.receiptVndAmount}
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
						
							${current.correspondingAccNo}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.description}
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