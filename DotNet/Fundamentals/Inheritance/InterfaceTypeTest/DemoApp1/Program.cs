Account jill = Banker.OpenSavingsAccount();
jill.Deposit(15000);

Account jack = Banker.OpenCurrentAccount();
jack.Deposit(30000);

// Transferring money from Jill's account to Jack's account
decimal payment = 5000;
jill.Transfer(payment, jack); // This calls the Transfer extension method
