<form action="/updateAcc" method="post">
	Id : <input type=text name="accNo" value="${acc.accNo}" readonly=readonly/><br>
	Name : <input type="text" name="accHolderName" value="${acc.accHolderName}"/><br>
	Amount : <input type="text" name="amount" value="${acc.amount}"/><br>
	Card No : <input type="number" name="debitCardNo" value="${acc.debitCardNo}"/><br>
	ATM Pin : <input type="password" name="atmPin" value="${acc.atmPin}"/><br>
	
	<input type="submit" value="Update Account"/>
</form>