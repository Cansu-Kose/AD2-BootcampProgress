# Araştırma Ödevleri:

- [Araştırma Projesi 1 - Lateinit](#1)
- [Araştırma Projesi 2 - Tools Namespace](#2)


### <a name="1"></a> Araştırma Projesi 1

- Lateinit neden kullanıyoruz?
- Lateinit kullanımından bahseder misiniz?
- Lateinit için bir örnek kullanım gösterir misiniz ?

### <a name="2"></a> Cevap 1
- Lateiniti sadece var olan değişkenlerde kullanılırız.Bir değişkene değer atamasının bir sonraki aşamada gerçekleştirilmesi halinde yani başlangıçta değer atamadan değişken tanımlamak için lateinit işaretleyicisi kullanılır.
- Lateinit'in Bytecode seviyesinde final olarak tanımlanmamalı çünkü constructorda değil, sonrasında tanımlaması yapılıyor.
- Örnek kullanımı
```kotlin
class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var textView: TextView
    private lateinit var imageView: ImageView
    private lateinit var constraintLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button=findViewById<Button>(R.id.startnow)
        button.setOnClickListener {
            val intent=Intent(this,StartActivity::class.java)
            startActivity(intent)
        }
    }
}
```

### <a name="3"></a> Araştırma Projesi 2


- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?
- Neden kullanılmaktadır ?
- Nasıl kullanılmalıdır ?
- Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ?

### <a name="4"></a> Cevap 2
- XML namespace, öğe adlandırma çakışmalarından kaçınmanın bir yolunu sağlar.
- Örneğin, A Okulunda Cansu adında bir öğrenci ve B Okulunda Cansu adında bir öğrenci var. Aynı isimli bu iki öğrenciyi nasıl tanımlayabiliriz? Namespace şu anda kullanışlı olacaktır. A ve B daha sonra namespace olarak kabul edilebilir. Başka bir deyişle, namespace belirli özniteliklerin bir koleksiyonunu içerir.
- Örnek kullanımı
```kotlin
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:text="UP School"
        android:id="@+id/textView" />
</LinearLayout>
```
- Android Studio, tools namespace tasarım zamanı özelliklerini etkinleştiren çeşitli XML özniteliklerini destekler.Bbir parçada hangi düzenin gösterileceği gibi veya derleme zamanı davranışları XML kaynaklarınıza hangi küçültme modunun uygulanacağı gibi.Uygulamanızı oluşturduğunuzda, derleme araçları bu özellikleri kaldırır, böylece APK boyutunuz veya çalışma zamanı davranışınız üzerinde hiçbir etkisi olmaz.
- tools:itemCount kullanımı
```kotlin
<android.support.v7.widget.RecyclerView
    android:id="@+id/recyclerView"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:itemCount="3"/>
 ```   
