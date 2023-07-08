# BetCombination

# Maç Kombinasyonları Uygulaması

Bu Android uygulaması, belirli bir sayıda maçın alabileceği farklı sonuç kombinasyonlarını gösterir. 
Kullanıcı, 1 ile 3 arasında bir maç sayısı girebilir ve uygulama, bu maç sayısına göre tüm olası kombinasyonları hesaplar ve sonuçları görüntüler.

## Özellikler

- Kullanıcı, 1 ile 3 arasında bir maç sayısı girebilir.
- Uygulama, bu maç sayısına göre tüm kombinasyonları hesaplar.
- Kombinasyonlar, belirli sonuçlara göre filtrelenir ve ekranda görüntülenir.
- Sonuçlar, bir sonuç metni görüntüleme alanında listelenir.
- Sonuç metni seçilebilir ve kopyalanabilir.

## Kullanım

1. Uygulama başlatıldığında, kullanıcıya bir maç sayısı girmesi istenir.
2. Kullanıcı, 1 ile 3 arasında bir sayı girebilir.
3. Kullanıcı "Hesapla" düğmesine tıklar.
4. Uygulama, girilen maç sayısına göre tüm kombinasyonları hesaplar.
5. Kombinasyonlar, belirli sonuçlara göre filtrelenir ve ekranda görüntülenir.
6. Sonuç metni, aşağıdaki formatta görüntülenir:

    ```
    1/1 -->
      1/1 = 1/1
      0/1 = 0/1
      ...

    0/1 -->
      1/1 = 0/1
      0/1 = 0/1
      ...

    ...

    1/2 -->
      1/1 = 1/2
      0/1 = 0/2
      ...
    ```

7. Kullanıcı, istediği kombinasyonları seçebilir ve metni kopyalayabilir.

## Kurulum

Bu uygulama, Android Studio kullanılarak geliştirilmiştir. Aşağıdaki adımları izleyerek projeyi yerel makinenizde çalıştırabilirsiniz:

1. Bu projeyi GitHub'dan veya ZIP olarak indirin ve yerel bir dizine çıkarın.
2. Android Studio'yu açın.
3. "File" menüsünden "Open" seçeneğini seçin ve indirdiğiniz proje dizinini seçin.
4. Proje başarılı bir şekilde açıldıktan sonra, bir Android cihazı veya emülatörü kullanarak uygulamayı çalıştırabilirsiniz.

## Katkıda Bulunma

Bu projeye katkıda bulunmak isterseniz, lütfen şu adımları izleyin:

1. Bu depoyu forklayın.
2. Yeni bir dal (branch) oluşturun: `git checkout -b my-new-feature`.
3. Yaptığınız değişiklikleri kaydedin: `git commit -am 'Add some feature'`.
4. Dalınıza yükleyin: `git push origin my-new-feature`.
5. Bir Pull Talebi (Pull Request) gönderin.
