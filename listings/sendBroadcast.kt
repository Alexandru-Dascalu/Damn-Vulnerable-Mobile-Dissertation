val broadcast = Intent("uk.ac.swansea.dascalu.dvmicc.newsaggregator.broadcast.NEWS_RESULT")
broadcast.putExtra("articles", articles)
sendBroadcast(broadcast,"uk.ac.swansea.dascalu.dvmicc.newsaggregator.permissions.READ_NEWS")