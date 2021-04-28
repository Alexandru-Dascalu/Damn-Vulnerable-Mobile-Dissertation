val noPaymentUri : Uri = Uri.parse("swan_bank_pay://uk.ac.swansea.dascalu.dvmicc.swan_bank/pay")
val intent = Intent(this, LogInActivity::class.java)
intent.setDataAndType(noPaymentUri, "text/plain")
startActivity(intent)