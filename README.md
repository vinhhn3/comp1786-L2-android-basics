# Use of String Resources

The folder `res` contains all Android Resources for the project

![img_2.png](img_2.png)

We can define string in `strings.xml`

```xml
<resources>
    <string name="app_name">comp1786-l2-android-basics</string>
    <string name="hello_world">Hello World from String Resources</string>
    <string name="course_name">COMP1786 Mobile Development</string>
</resources>
```

Plus, we can also add more color in `colors.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="black">#FF000000</color>
    <color name="white">#FFFFFFFF</color>
    <color name="blue">#0000FF</color>
</resources>
```

Then, we can use it `activity_main.xml` 

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/hello_world"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/hello_world"
        android:textColor="@color/blue"
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/course_name"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="32dp"
        android:text="Text View"
        android:textSize="20sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/hello_world" />

</androidx.constraintlayout.widget.ConstraintLayout>
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

![img_1.png](img_1.png)