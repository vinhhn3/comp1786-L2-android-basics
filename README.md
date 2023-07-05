# Use of String Resources

We can define string in `string.xml`

```xml
<resources>
    <string name="app_name">comp1786-l2-android-basics</string>
    <string name="hello_world">Hello World from String Resources</string>
    <string name="course_name">COMP1786 Mobile Development</string>
</resources>
```

Then, we can use it `activity_main.xml` 

```xml
    <TextView
        android:id="@+id/hello_world"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/hello_world"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
```

Or it can be used in `MainActivity.java`

```java
public class MainActivity extends AppCompatActivity {

    TextView courseName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        courseName = findViewById(R.id.course_name);
        courseName.setText(R.string.course_name); // Get value of course_name in strings.xml
    }
}
```

The final application is below:
![img.png](img.png)