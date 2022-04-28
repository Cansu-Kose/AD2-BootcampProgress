# Araştırma Ödevleri:

- [Araştırma Projesi 1 - Lateinit](#1)
- [Araştırma Projesi 2 - Tools Namespace](#2)
- [Araştırma Projesi 3 - Font family XML](#3)
- [Araştırma Projesi 4 - Property Animation](#4)


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

## <a name="5"></a> Araştırma Projesi 3

- Font family dosyası nasıl oluşturulup kullanıyoruz?
- Neden belirttiğiniz şekilde kullanımı tercih ediyoruz?

### <a name="6"></a> Cevap 3
- Fontları kaynak olarak eklemek için Android Studio'da res klasörüne sağ tıklayın ve New > Android resource directory dizinine gidin.Resource type ı font olarak girin.Resource name i font olarak girin ve ok tuşuna tıklayın.Sonra oluşturduğunuz font klasörüne sağ tıklayın ve New > Font resource file dizisine gidin.Dosya adını girip ok tuşuna tıklayın.Her yazı tipi dosyasının, stilini ve ağırlık özniteliğini <font> öğesi içine alın. Aşağıdaki XML, yazı tipi kaynağı XML'sine yazı tipiyle ilgili niteliklerin eklenmesini gösterir.
```kotlin
<?xml version="1.0" encoding="utf-8"?>
<font-family xmlns:android="http://schemas.android.com/apk/res/android">
    <font
        android:fontStyle="normal"
        android:fontWeight="400"
        android:font="@font/lobster_regular" />
    <font
        android:fontStyle="italic"
        android:fontWeight="400"
        android:font="@font/lobster_italic" />
</font-family>
```
Textview e bu fontu eklemek isterseniz Layout XML dosyasında, erişmek istediğiniz font dosyasına fontFamily özniteliğini ayarlayın.
```kotlin 
<TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:fontFamily="@font/lobster"/>
```
- Bu şekilde kullanımın tercih edilmesinin nedeni Android'de, bir XML kaynağı olarak yeni bir yazı tipi ailesi oluşturulduğunda her bir stile ve ağırlığa ayrı kaynaklar olarak başvurmak yerine tek bir birim olarak erişebilirsiniz. Bunu yaparak sistem, kullanmaya çalıştığınız metin stiline göre doğru yazı tipini seçebilir.

## <a name="7"></a> Araştırma Projesi 4

- Property Animation ile ilgili olarak objectAnimator ile animator arasındaki farkı kısaca açıklayınız
    
### <a name="8"></a> Cevap 4
- Property Animation arka plan rengi veya alfa değeri gibi hedef nesnenin özelliklerini belirli bir süre boyunca değiştiren, XML'de tanımlanan bir animasyondur ve objectAnimator için kaynak işaretçisi(resources point)dir.
- ValueAnimator'ın bu alt sınıfı olan objectAnimator, hedef nesnelerde özelliklerin canlandırılması için destek sağlar. Bu sınıfın yapıcıları, canlandırılacak olan hedef nesnenin yanı sıra canlandırılacak özelliğin adını tanımlamak için parametreler alır. Uygun set/get işlevleri daha sonra dahili olarak belirlenir ve animasyon, özelliği canlandırmak için gerektiğinde bu işlevleri çağırır. 
