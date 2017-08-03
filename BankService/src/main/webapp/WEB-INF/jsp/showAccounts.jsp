<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table border=2>
	<tr><th>A/C Id</th><th>A/C Holder Name</th><th>Amount</th><th>Debit Card Number</th><th>ATM Pin</th><th>Update</th></tr>
	<c:forEach items="${axisAc}" var="acc">
		<tr><td><c:out value="${acc.accNo}"/></td>
			<td><c:out value="${acc.accHolderName}"/></td>
			<td><c:out value="${acc.amount}"/></td>
			<td><c:out value="${acc.debitCardNo}"/></td>
			<td><c:out value="${acc.atmPin}"/></td>
			<td><a href='/updateAccountPage?accNo=${acc.accNo}'><font color="blue">Update</font></a>
		</tr>
	</c:forEach>
</table>