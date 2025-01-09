# Selenium Test Otomasyon Projesi

Bu proje, Amazon Türkiye web sitesinde bir ürün arama, ürünü sepete ekleme ve sepeti kontrol etme sürecini otomatikleştirmek amacıyla yazılmıştır. Proje, Selenium kütüphanesi kullanılarak oluşturulmuş ve Java programlama dili ile geliştirilmiştir. Aşağıda proje detayları ve bileşenlerin açıklamaları yer almaktadır.

## Proje Yapısı

### 1. BasePage Sınıfı
Bu sınıf, diğer sayfa sınıflarının temelini oluşturur ve sık kullanılan Selenium işlemlerini içerir:
- **find(By locator):** Belirtilen bir lokasyonda eleman bulur.
- **findAll(By locator):** Belirtilen lokasyondaki tüm elemanları bulur.
- **click(By locator):** Bir elemanı tıklar.
- **type(By locator, String text):** Bir metni belirtilen alana yazar.
- **isDisplayed(By locator):** Bir elemanın görünür olup olmadığını kontrol eder.

### 2. CartPage Sınıfı
Sepet sayfasını temsil eder. Öne çıkan metodlar:
- **checkIfProductAdded():** Sepette ürün olup olmadığını kontrol eder.
- **getProducts():** Sepetteki ürünleri döner.

### 3. HomePage Sınıfı
Ana sayfa işlemlerini yönetir. Öne çıkan metodlar:
- **acceptCookies():** Çerezleri kabul eder.
- **searchBox():** Arama kutusunu kullanır.
- **goToCart():** Sepet sayfasına gider.

### 4. Log Sınıfı
Test sonuçlarını loglama amacıyla kullanılan sınıf. Loglama işlemleri için Log4j kütüphanesi kullanılmıştır:
- **info(String message):** Bilgilendirme mesajı loglar.
- **warn(String message):** Uyarı mesajı loglar.
- **error(String message):** Hata mesajı loglar.

### 5. ProductDetailPage Sınıfı
Ürün detay sayfasını temsil eder:
- **isOnProductDetailPage():** Detay sayfasında olup olmadığını kontrol eder.
- **addToCart():** Ürünü sepete ekler.

### 6. ProductsPage Sınıfı
Ürün listesi sayfasını temsil eder:
- **isOnProductPage():** Ürün sayfasında olup olmadığını kontrol eder.
- **selectProduct(int i):** Belirtilen sıradaki ürünü seçer.

### 7. SearchBox Sınıfı
Arama kutusunu temsil eder:
- **search(String text):** Arama işlemi gerçekleştirir.

### 8. BaseTest Sınıfı
Test öncesi ve sonrası işlemleri gerçekleştiren temel sınıf:
- **setUp():** Tarayıcıyı başlatır ve test ortamını hazırlar.
- **tearDown():** Test sonrası tarayıcıyı kapatır.

### 9. TestAddProductToCart Sınıfı
Test senaryolarını içerir:
- **search_a_product():** Bir ürün arar.
- **select_a_product():** Ürün seçer.
- **add_product_to_cart():** Ürünü sepete ekler.
- **go_to_cart():** Sepet sayfasına gider ve ürünün sepette olduğunu doğrular.

### 10. TestResultLogger Sınıfı
Testlerin durumlarını loglar:
- Başarılı, başarısız veya devre dışı bırakılan testler için loglama işlemi yapılır.

## Genel Amaç
Bu proje, bir web uygulamasındaki kullanıcı akışlarını otomatik olarak test etmek, olası hataları tespit etmek ve web uygulamasının düzgün çalıştığını garanti etmek amacıyla geliştirilmiştir. Otomasyon, manuel test sürecini hızlandırır ve daha güvenilir bir test süreci sunar.

## Çalıştırma Talimatları
1. **Gereksinimleri Kurun:**
   - Java Development Kit (JDK)
   - Maven
   - Selenium WebDriver
   - Log4j Kütüphanesi

2. **WebDriver Ayarları:**
   - WebDriverManager ile tarayıcı sürücüsünü kurun.

3. **Testleri Çalıştırın:**
   - `mvn test` komutuyla tüm testleri çalıştırabilirsiniz.

## Projenin Avantajları
- Kullanıcı akışlarını hızlı ve hatasız bir şekilde test eder.
- Kod tekrarını önler ve bakımı kolaylaştırır.
- Loglama sistemi sayesinde test sonuçları detaylı bir şekilde analiz edilebilir.

**Bu proje ile Amazon Türkiye alışveriş akışlarını otomatik olarak test edebilir ve web sitesinin işlevselliğini kontrol edebilirsiniz.**


![image](https://github.com/user-attachments/assets/9ed0f8e5-e67f-479f-842c-5959598ccbbf)

![image](https://github.com/user-attachments/assets/1a357e30-66ae-4e9c-99b9-c72e2bde98de)

