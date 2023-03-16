class MainActivity : AppCompatActivity() {

    private lateinit var analytics: Analytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        analytics = Analytics.getInstance(this)

        button.setOnClickListener {
            // Track a button click event
            analytics.trackEvent("Button Clicked")
        }
    }
}
