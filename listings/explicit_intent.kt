val noPaymentUri : Uri = Uri.parse("santander_pay://uk.ac.swansea.dascalu.dvmicc.santander/pay")
val intent = Intent(this, LogInActivity::class.java)
intent.setDataAndType(noPaymentUri, "text/plain")
startActivity(intent)