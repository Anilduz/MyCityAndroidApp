package com.example.mycity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private ArrayAdapter<String> adapter;
    private String[] sehirler = {"Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Isparta", "İçel (Mersin)", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri", "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray", "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"};
    private String[] sehirlerAciklama = {
            " 'http://www.adana.gov.tr' Adana, Türkiye'nin bir ili ve en kalabalık yedinci şehridir. 2021 yılı verilerine göre 2.263.373 nüfusa sahiptir. İlin yüzölçümü 13.844 km²dir. İlde km²ye 163 kişi düşmektedir. 04.02.2021 TÜİK verilerine göre 5'i merkez ilçe olmak üzere toplam 15 ilçesi ve belediyesi vardır. Bu ilçelerde 831 mahalle bulunmaktadır. ",
            "Adıyaman Uzun yıllar boyunca Hısnımansûr adıyla anılan şehrin içinde olduğu bölgede yerleşimin tarihi oldukça eski dönemlere kadar uzanmaktadır. Bölgede tarih boyunca Hitit, Hurri, Mitanni, Kummuh, Asur, Pers, Seleukos, Kommagene Krallığı ile Roma ve Bizans hakimiyeti görülmüştür. 7. yüzyıldan itibaren İslâm akınları bölgede görülmeye başlamış ve 670 yılında yerleşiminde içerisinde olduğu bölge Emevî hakimiyetine geçmiştir. Emevî kumandanlarından Mansûr bin Ca'vene tarafından bugünkü kale inşa ettirildi. 758'de Abbâsî egemenliğine geçen Hısnımansûr, 926-958 yılları arasındaki Hamdaniler döneminden sonra yeniden Bizans hakimiyetine geçti. 11. yüzyılda Türk akınlarına uğrayan yerleşim, ilk defa 1066’da Selçuklu kumandanı Gümüştekin tarafından alındı. Artuklu, Eyyûbî ve Selçuklu, İlhanlı, Akkoyunlu, Dulkadiroğulları ve Memlüklü hakimiyetinden sonra 1515 yılında Osmanlı egemenliğine geçti.\n" +
                    "\n" +
                    "Osmanlı idaresinde 1519'da Maraş eyaletine bağlı sancak olan yerleşim, 1531 yılında Elbistan sancağına bağlı bir kaza haline getirildi. 1519 yılında yerleşimin ilk tahririnde 1000 civarında Müslüman nüfusun yanında yerleşimde 400 civarında da Gayrimüslim nüfus bulunmaktaydı. Hısnımansûr, 1563'te yeniden Maraş’a bağlandı ve uzunca yıllar bu konumda kaldı. Tanzimattan sonraki düzenlemede 1841'de kaza olan yerleşim, 1849'da Diyarbekir vilayetine bağlı bir sancak durumuna getirildi. 1859'da Malatya sancağına, 1883’te de Harput Vilayeti'ne bağlandı. Cumhuriyet döneminde Hısnımansûr, 1923'ten 1954 yılına kadar Malatya’nın ilçesi olarak kaldı. 22 Haziran 1954'te Adıyaman ilinin kurulmasıyla merkez ilçe oldu.\n" +
                    "\n" +
                    "Atatürk Barajı'nın büyük bir kısmı Adıyaman ili sınırları içerisinde yer alır.\n" +
                    "\n" +
                    "Daha önceleri merkeze bağlı Esentepe köyü, 2004'te mahalleye dönüştü.",

                    "The top of the rock in Afyon has been fortified for a long time. It was known to the Hittites as Hapanuwa, and was later occupied by Phrygians, Lydians and Achaemenid Persians until it was conquered by Alexander the Great. After the death of Alexander the city (now known as Akroinοn (Ακροϊνόν) or Nikopolis (Νικόπολις) in Ancient Greek), was ruled by the Seleucids and the kings of Pergamon, then Rome and Byzantium. The Byzantine emperor Leo III after his victory over Arab besiegers in 740 renamed the city Nicopolis (Greek for \"city of victory\"). The Seljuq Turks then arrived in 1071 and changed its name to Kara Hissar (\"black castle\") after the ancient fortress situated upon a volcanic rock 201 meters above the town. Following the dispersal of the Seljuqs the town was occupied by the Sâhib Ata and then the Germiyanids.\n" +
                            "\n" +
                            "The castle was much fought over during the Crusades and was finally conquered by the Ottoman Sultan Beyazid I in 1392 but was lost after the invasion of Timur Lenk in 1402. It was recaptured in 1428 or 1429.\n" +
                            "\n" +
                            "The area thrived during the Ottoman Empire, as the centre of opium production and Afyon became a wealthy city. In 1902, a fire burning for 32 hours destroyed parts of the city.[11]\n" +
                            "\n" +
                            "During the 1st World War British prisoners of war who had been captured at Gallipoli were housed here in an empty Armenian church at the foot of the rock. During the Greco-Turkish War (1919-1922) campaign (part of the Turkish War of Independence) Afyon and the surrounding hills were occupied by Greek forces. However, it was recovered on 27 August 1922, a key moment in the Turkish counter-attack in the Aegean region. After 1923 Afyon became a part of the Republic of Turkey.\n" +
                            "\n" +
                            "The region was a major producer of raw opium (hence the name Afyon) until the late 1960s when under international pressure, from the US in particular, the fields were burnt and production ceased. Now poppies are grown under a strict licensing regime. They do not produce raw opium any more but derive Morphine and other opiates using the poppy straw method of extraction.[12]\n" +
                            "\n" +
                            "Afyon was depicted on the reverse of the Turkish 50 lira banknote of 1927–1938.[13]",
                            "In the Ottoman Empire era, the area was called Karakilisa (قره\u200Cکلیسا). The current town center was founded around 1860 by a group of Armenian merchants from Bitlis with the name Karakilise (lit. 'the black church') that became known to the local population as Karakise, and this version was turned officially to Karaköse at the beginning of the Republican era. This name was changed to Ağrı by 1946.[7]\n" +
                                    "\n" +
                                    "In the years of 1927 to 1931, the region was under Occupation of the Kurdish separatist Movements, which gained to establish an unrecognized state named Republic of Ararat which was led by several Kurdish leaders, some of the Main were Ibrahim Heski and Ihsan Nuri.\n" +
                                    "\n" +
                                    "In the medieval period, the district's administrative centre was located at Alashkert, once an important town. The \"kara kilise\" that gave the town its name was a medieval Armenian church. In 1895 Lynch stayed in Karakilise and wrote that it had between 1500 and 2000 inhabitants, was nearly two-thirds Armenian, and that a barracks for a locally recruited Kurdish Hamidiyeh regiment had been recently located in the town.[8]\n" +
                                    "\n",
                            "Amasya (Turkish pronunciation: [aˈmasja]; Greek: Ἀμάσεια) is a city in northern Turkey and is the capital of Amasya Province, in the Black Sea Region. It used to be called Amaseia or Amasia in antiquity.[3] Amasya stands in the mountains above the Black Sea coast, set apart from the rest of Anatolia in a narrow valley along the banks of the Yeşilırmak River. Although near the Black Sea, this area is high above the coast and has an inland climate, well-suited to growing apples, for which Amasya province, one of the provinces in north-central Anatolia Turkey, is famed. It was the home of the geographer Strabo and the birthplace of the 15th century scholar and physician Amirdovlat Amasiatsi. Located in a narrow cleft of the Yeşilırmak (Iris) river, it has a history of 7,500 years which has left many traces still evident today.\n" +
                                    "\n" +
                                    "In antiquity, Amaseia was a fortified city high on the cliffs above the river. It has a long history as a wealthy provincial capital, producing kings and princes, artists, scientists, poets and thinkers, from the kings of Pontus, through Strabo the geographer, to many generations of the Ottoman imperial dynasty. With its Ottoman-period wooden houses and the tombs of the Pontus kings carved into the cliffs overhead, Amasya is attractive to visitors. In recent years, there has been much investment in tourism, and therefore more foreign and Turkish tourists have visited the city.\n" +
                                    "\n" +
                                    "During the early Ottoman rule, it was customary for young Ottoman princes to be sent to Amasya to govern and gain experience. Amasya was also the birthplace of the Ottoman sultans Murad I and Selim I. Traditional Ottoman houses near the Yeşilırmak and the other main historical buildings have been restored; these traditional Yalıboyu houses are now used as cafes, restaurants, pubs and hotels. Behind the Ottoman wooden houses one can see the rock tombs of the Pontic kings.",
                                    "Ankara (/ˈaŋkaɾa/), Türkiye'nin başkenti ve en kalabalık ikinci ilidir.[6] Nüfusu 2022 yılı itibarıyla 5.747.325 kişidir. Bu nüfus; 25 ilçe ve bu ilçelere bağlı 1425 mahallede yaşamaktadır. İl genelinde nüfus yoğunluğu 215'tir. Nüfuslarına göre şehirler listesinde belediye sınırları göz önüne alınarak yapılan sıralamaya göre dünyada ise elli yedinci sırada yer almaktadır. Coğrafi olarak Türkiye'nin merkezine yakın bir konumda bulunur ve Batı Karadeniz Bölgesi'nde kalan kuzey kesimleri hariç, büyük bölümü İç Anadolu Bölgesi'nde yer alır. Yüzölçümü olarak ülkenin üçüncü büyük ilidir. Bolu, Çankırı, Kırıkkale, Kırşehir, Aksaray, Konya ve Eskişehir illeri ile çevrilidir.\n" +
                                            "\n" +
                                            "Ankara'nın 13 Ekim 1923'te[7] başkent ilan edilmesinin ardından şehir hızla gelişmiş ve Türkiye'nin ikinci en kalabalık ili olmuştur.[kaynak belirtilmeli] Türkiye Cumhuriyeti'nin ilk yıllarında ekonomisi tarım ve hayvancılığa dayanan ilin topraklarının yarısı hâlâ tarım amaçlı kullanılmaktadır. Ekonomik etkinlik büyük oranda ticaret ve sanayiye dayalıdır. Tarım ve hayvancılığın ağırlığı ise giderek azalmaktadır. Ankara ve civarındaki gerek kamu sektörü gerek özel sektör yatırımları, başka illerden büyük bir nüfus göçünü teşvik etmiştir. Cumhuriyetin kuruluşundan günümüze, nüfusu ülke nüfusunun iki katı hızda artmıştır. Nüfusun yaklaşık dörtte üçü hizmet sektörü olarak tanımlanabilecek memuriyet, ulaşım, haberleşme ve ticaret benzeri işlerde, dörtte biri sanayide, %2'si ise tarım alanında çalışır. Sanayi, özellikle tekstil, gıda ve inşaat sektörlerinde yoğunlaşmıştır. Günümüzde ise en çok savunma, metal ve motor sektörlerinde yatırım yapılmaktadır. Türkiye'nin en çok sayıda üniversiteye sahip ili olan Ankara'da ayrıca, üniversite diplomalı kişi oranı ülke ortalamasının iki katıdır. Bu eğitimli nüfus, teknoloji ağırlıklı yatırımların gereksinim duyduğu iş gücünü oluşturur. Ankara'dan otoyollar, demir yolu ve hava yoluyla Türkiye'nin diğer şehirlerine ulaşılır.\n" +
                                            "\n" +
                                            "Bilinen tarihi en az 10 bin yıl öncesine, Eski Taş Çağı'na ulaşan[8] Ankara, tarih öncesinden günümüze dek pek çok medeniyeti barındırmıştır. Hititler, Frigyalılar, Lidyalılar, Persler, Galatlar, Romalılar, Bizanslılar, Selçuklu Hanedanı, Osmanlılar ve nihayet Türkiye Cumhuriyeti, il topraklarını kontrolleri altında tutmuştur. Tektosagların ve Türkiye Cumhuriyeti'nin başkenti olan Ankara şehri ve Frigyalıların başkenti Gordion, il sınırları içinde yer alır. Yıldırım Bayezid'in Timurlenk'e yenik düştüğü Ankara Muharebesi Çubuk yakınlarında ve Türk Kurtuluş Savaşı'nın dönüm noktası olan Sakarya Muharebesi Polatlı yakınlarında yapılmıştır.\n" +
                                            "\n" +
                                            "Ankara kara iklimine sahiptir. Şehir dışındaki il topraklarının büyük kısmı tahıl tarlalarıyla kaplı platolardan oluşur. İlin çeşitli yerlerindeki doğal güzellikler korumaya alınmış, dinlenme ve eğlence amaçlı kullanıma sunulmuştur. İlin adını taşıyan tavşanı, keçisi, atı ve kedisi dünya çapında bilinir, armudu, çiğdemi, yerel yemeklerden Ankara tavası ve Kızılcahamam ve Beypazarı'nın maden suyu ise ülke çapında tanınır.",
                                            "From Alanya I went to Antaliya [Adalia], a most beautiful city. It covers an immense area, and though of vast bulk is one of the most attractive towns to be seen anywhere, besides being exceedingly populous and well laid out. Each section of the inhabitants lives in a separate quarter. The Christian merchants live in a quarter of the town known as the Mina [the Port], and are surrounded by a wall, the gates of which are shut upon them from without at night and during the Friday service. The Greeks, who were its former inhabitants, live by themselves in another quarter, the Jews in another, and the king and his court and Mamluks in another, each of these quarters being walled off likewise. The rest of the Muslims live in the main city. Round the whole town and all the quarters mentioned there is another great wall. The town contains orchards and produces fine fruits, including an admirable kind of apricot, called by them Qamar ad-Din, which has a sweet almond in its kernel. This fruit is dried and exported to Egypt, where it is regarded as a great luxury.\n" +
                                                    "\n" +
                                                    "In the second half of the 17th century Evliya Çelebi wrote of a city of narrow streets containing 3,000 houses in 20 Turkish and four Greek neighborhoods. The town had grown beyond the city walls and the port was reported to hold up to 200 boats.\n" +
                                                    "\n" +
                                                    "\n" +
                                                    "Vilayet of Adalia (Antalya) in 1890\n" +
                                                    "In the 19th century, in common with most of Anatolia, its sovereign was a \"dere bey\" (landlord or landowner). The family of Tekke Oğlu, domiciled near Perge had been reduced to submission in 1812 by Mahmud II, but continued to be a rival power to the Ottoman governor until the early 20th century, surviving by many years the fall of the other great beys of Anatolia. The records of the Levant (Turkey) Company, which maintained an agency in Antalya until 1825, documented the local dere beys.[23]\n" +
                                                    "\n" +
                                                    "In the early 20th century, Antalya had two factories spinning and weaving cotton. As of 1920, the factories had 15,000 spindles and over 200 looms. A German-owned mill baled cotton. There were gin mills.[24]\n" +
                                                    "\n" +
                                                    "In the 20th century, the population of Antalya increased as Turks from the Caucasus and the Balkans moved into Anatolia. The economy was centered on its port that served the inland areas, particularly Konya. Antalya (then Adalia) was picturesque rather than modern. The chief attraction for visitors was the city wall, and outside a promenade, a portion of which survives. The government offices and the houses of the higher classes were outside the walls.[23]\n" +
                                                    "\n" +
                                                    "\n" +
                                                    "The Ottoman Houses in Kaleiçi.\n" +
                                                    "As of 1920, Antalya was reported as having a population of approximately 30,000. The harbor was described as small, and unsafe for vessels to visit in the winter. Antalya was exporting wheat, flour, sesame seeds, livestock, timber and charcoal. The latter two were often exported to Egypt and other goods to Italy or other Greek islands, who received mainly flour. In 1920, the city had seven flour mills. Wheat was imported, and then processed in town before exportation. Antalya imported manufactured items, mainly from the United Kingdom.[25] The city had a Greek minority that made up 1/3 of the population until the population exchange. Antalya also had a tiny Armenian population which had a church on the street of \"Hamam çikmazi\" named Hovhannes Surp Garabed, which was later on demolished. Antalya also had a Jewish community which had a tiny Synagogue in the neighborhood of Balbey and a Talmud Torah. The Synagogue was closed in 1948 and its exact location is not known and the Synagogue might not exist anymore. The Jewish community had 2 graveyards and one was located across \"Donerciler carsisi\"and was demolished when the area was opened to construction, but one marble tombstone belonging to a Jew named Raphael Moshe was transferred to the Antalya Museum where it can be seen in the museum garden.\n" +
                                                    "\n" +
                                                    "The city was occupied by Italy for three years (1919-22) in the aftermath of World War I, but was recaptured by a newly independent Turkey in the War of Independence. Large-scale development beginning in the 1970s transformed Antalya from a pastoral town into one of Turkey's largest metropolitan areas. Much of this has been due to tourism, which expanded in the 21st century. In the 1985 singing diva Dalida held her last concert in Antalya.\n" +
                                                    "\n" +
                                                    "Antalya was the host city for the 2015 G-20 summit and the EXPO 2016. Five countries have their consular missions in Antalya including Germany, Great Britain, Russia, Belgium and Serbia.[26]\n",
                                                    "Artvin, Türkiye'nin Karadeniz Bölgesi'nin Doğu Karadeniz Bölümü'nde yer alan, Karadeniz'e kıyısı bulunan bir ildir. İl, Türkiye'nin Gürcistan'la olan sınırında yer alan kuzeydoğu köşesidir. Doğusunda Ardahan ili, güneyinde Erzurum ili ve batısında Rize ili vardır.\n" +
                                                            "\n" +
                                                            "2019 Yılı verilerine göre nüfusu 170.875’dir.[4] Bu nüfusun %62,4'ü şehirlerde yaşamaktadır. İlin yüzölçümü 7.436 km²'dir. İlde km²'ye 23 kişi düşmektedir. (Bu sayı merkez ilçede 30'dur.) İl merkezinin denizden yüksekliği: 530 m.'dir.\n" +
                                                            "\n" +
                                                            "2020 yılında TÜİK verilerine göre merkez ilçeyle beraber 9 İlçe, 9 belediye, bu belediyelerde 39 mahalle ve ayrıca 320 köyü vardır.[2]\n" +
                                                            "\n" +
                                                            "Coğrafi ve kültürel yapısıyla Anadolu'nun diğer bölgelerinden keskin çizgilerle ayrılır. Yüzey şekilleri çok engebelidir. İklim çeşitliliği fazladır. İlin en önemli akarsuyu, 1956 yılına kadar adını veren Çoruh Nehri'dir. Artvin boğalarıyla meşhur bir il olup simgesi boğadır. Artvin il topraklarının yaklaşık %55’ini ormanlık alanlar kaplamıştır. Murgul'da bakır madeni vardır. Tarihte genellikle Livane ve Çoruh adıyla bilinir. Artvin il nüfusunu Gürcüler, Hemşinliler, Ahıska Türkleri ve Lazlar oluşturur.\n" +
                                                            "\n" +
                                                            "Millî parklarıyla ünlüdür. Şavşat ilçesinde bulunan Karagöl Sahara Millî Parkı içerisinde bulunan Şavşat-Karagöl ve Borçka-Karagöl turistik yerlerden bazılarıdır. Efeler-Gorgit Tabiatı Koruma Alanı esas olmak üzere Camili yöresi Birleşmiş Milletler Eğitim, Bilim ve Kültür Örgütü tarafından biyosfer rezerv alanı olarak belirlenen Türkiye'deki tek bölgedir ve bir dünya mirası olarak görülmektedir.[5]\n" +
                                                            "\n" +
                                                            "İlin bir önceki adı Çoruh olup, TBMM'nde kabul edilen 17 Şubat 1956 tarih ve 6668 sayılı kanunla Artvin olmuştur.[6]" +
                                                            "\n" +
                                                            "oprak yapısının elverişsiz olması ve bilim merkezlerinden uzaklığı nedeni ile planlı ve bilimsel tarzda arkeolojik çalışmalar yapılamamıştır. 1933 ve 1955 yıllarında Yusufeli ve Şavşat yörelerinde halkın bulduğu bakır baltaların MÖ 4000-3000 yıllarına ait olduğu sanılmaktadır. Aynı yörede bulunan tunç baltaların MÖ 3000-2000 yıllarına ait oldukları bilinmektedir.\n" +
                                                            "\n" +
                                                            "Artvin ve çevresi tarih öncesi devirleri Cilalı Taş Devri'nden başlayarak Bakır, Tunç ve Demir çağlarını sırası ile yaşamıştır. MÖ 10 bin ile 8 bin yıllarından kalma Cilalı Taş Devri'ne ait insan izleri Artvin’de de bu çağlarda insanların yaşamış olduğu izlenimini vermektedir. Bulunan madeni eşyalar ise tarih öncesi devirlerin sırası ile yaşandığını belgelemektedir.\n" +
                                                            "\n" +
                                                            "Osmanlı dönemi\n" +
                                                            "\n" +
                                                            "Bir Alman firması tarafından işletilen Hopa madenleri 20. y.y. başları\n" +
                                                            "Artvin ilinin Osmanlı yönetimine ne zaman geçtiği konusunda kesin bir bilgi ya da belge yoktur. II. Mehmed’in Trabzon İmparatorluğu'nu yıkarak Karadeniz bölgesinin sahil kıyısını Artvin ilinin kıyı kesiminden itibaren ele geçirdiği bilinmektedir. Bu sırada Artvin, Yusufeli, Ardanuç, Borçka, Çıldır Atabeyliği'nin elinde bulunuyordu.\n" +
                                                            "\n" +
                                                            "I. Selim Trabzon valisiyken Gürcistan’a yaptığı seferde Batum’un güneybatısında bulunan Güney Kalesini ele geçirmiştir. Bu kalenin adı ile sancak kuran I. Selim sancağa Borçka, Hopa ve Artvin’i bağlamıştır. 1534'te Erzurum beylerbeyi Mehmed Han, Yusufeli civarına akınlar yapmıştır. Ardanuç Atabeyi II. Keykavus ayaklanınca I. Selim’in oğlu padişah I. Süleyman ikinci veziri Kara Ahmed Paşa'yı isyanı bastırmakla görevlendirmiştir. Kara Ahmet Paşanın ikinci seferi ile Pert-Eğekte adlı ilk Livane Sancağı kuruldu. 1549-51 yılları arasında Şavşat-Yusufeli arasındaki Ardanuç bölgesi iki yıl kadar II. Keykavus’un elinde kaldı. 13 Haziran 1551 günü Ardanuç Kalesi'ni de fetheden Erzurum Beylerbeyi İskender Paşa bu bölgeyi de Osmanlı'ya kattı.\n" +
                                                            "\n" +
                                                            "Artvin ve çevresi yaklaşık 250 yıl Osmanlı Devletinin egemenliğinde kalmıştır. 1828 Osmanlı-Rus savaşı ve savaş sonucu imzalanan Edirne Anlaşması ile Ahıska Osmanlı elinden çıkınca Çıldır eyalet teşkilatı bozuldu. Anlaşma gereği Çıldır eyaletinin bir kısmını Osmanlı kaybetti. Buna karşılık Artvin, Borçka, Ardanuç, Şavşat ve Yusufeli Osmanlı elinde kaldı.\n" +
                                                            "\n" +
                                                            "Rusların güneye inme ve dünya imparatorluğu yaratma planı ile 1877-78 (93 Harbi) Osmanlı-Rus savaşı çıktı. 24 Nisan'da Rusya Kars, Ardahan ve Batum’u işgal ettikten sonra Türk topraklarına doğru ilerlemeye başladı. 2 Mayıs 1877’de 800’den fazla askeri şehit ettiler. Ardahan çevresini ele geçiren Ruslara karşı Artvin halkı Ardanuç ve Şavşat’a doğru göç etmeye başladılar.\n" +
                                                            "\n" +
                                                            "Şıpka geçidinde hatalı hatlar kuran Süleyman Paşa yüzünden Ruslar bu hatları delerek Doğu Anadolu içlerine kadar ilerlediler. Osmanlı barış teklifinde bulunmak zorunda kaldı. 3 Mart 1878’de Osmanlı ile Rusya arasında 29 maddeden oluşan Ayastefanos Antlaşması imzalandı. 19. maddesinde yer alan 245.207.301 altın tazminatını ödemeyen Osmanlı, Kars, Ardahan, ve Batum topraklarını Rusya’ya tazminat karşılığı vermek zorunda kaldı. Bu barış Avrupalı devletlerin çıkarına aykırı düşünce 23 Aralık 1878’de Berlin Antlaşması imzalandı. Bu barış ile Elviye-i Selâse denen Kars, Ardahan, ve Batum Rusya eline geçti. 8 Şubat 1879’da Osmanlı ile Rusya arasında imzalanan Büyük Muhaide anlaşması ile Kars, Ardahan, ve Batum’da yaşayan Türkler batıya doğru göç etmeye başlamışlardır.\n" +
                                                            "\n" +
                                                            "Osmanlı döneminde nüfus\n" +
                                                            "Artvin mutasarrıfı tarafından 1922 yılının Haziran ayında düzenlenen cetvellere göre, Merkez, Borçka, Şavşat, Hopa, Arhavi, Ardanuç kazaları ve bunlara bağlı nahiyelerinin nüfusları aşağıdaki gibidir.[7]\n" +
                                                            "\n" +
                                                            "Artvin\tTürk\tGürcü\tHemşin\tLaz\n" +
                                                            "Merkez\t\t\t\t\n" +
                                                            "Ardanuç\t7.709\t0\t0\t0\n" +
                                                            "Berta\t1.122\t0\t0\t0\n" +
                                                            "Sirya\t1.528\t0\t0\t0\n" +
                                                            "Şavşat\t6000\t2400\t0\t203\n" +
                                                            "Merya\t8539\t1.150\t0\t0\n" +
                                                            "İmerhev\t0\t7.134\t0\t0\n" +
                                                            "Borçka\t0\t5.433\t745\t850\n" +
                                                            "Maralid\t0\t1.333\t0\t0\n" +
                                                            "Maçahel(Maçahalis)\t0\t1.480\t0\t0\n" +
                                                            "Murgul\t0\t1.560\t0\t150\n" +
                                                            "Hopa\t1.000\t150\t2000\t4.500\n" +
                                                            "Kemalpaşa\t0\t0\t750\t1500\n" +
                                                            "Arhavi\t750\t950\t600\t4.250\n" +
                                                            "Toplam\t26.648\t21.550\t4.095\t11.453\n" +
                                                            "Cumhuriyet dönemi\n" +
                                                            "1924 yılında sancaklar vilâyet haline dönüştürülünce Artvin de vilâyet oldu. Ancak Artvin vilâyeti 1 Haziran 1933'te lağvedildi ve burası bir kaza merkezi olarak merkezi Rize olan Çoruh vilâyetine bağlandı. Bu durum 3 yıl kadar sürdü. Artvin 4 Ocak 1936 tarihinde yeni kurulan Çoruh vilâyetinin merkezi oldu. 17 Şubat 1956 tarihinde ise Çoruh adı kaldırıldı ve ilin adı Artvin haline getirildi.[6]\n" +
                                                            "\n" +
                                                            "Coğrafya\n" +
                                                            "İklim\n" +
                                                            "Artvin'in iklimi Türkiye'de Karadeniz iklimidir. Kıyı kesimlerinde ılık ve yağışlı iklim tipi egemendir. Artvin merkezinin de ılık ve yağışlı bir iklim tipi vardır. İlin yüksek kesimleri diğer Karadeniz Bölgesi illerinde de olduğu gibi kışları kar yağışlıdır. Sahil kesiminde örneğin Hopa'da en soğuk ay ortalaması 8,4 °C, en sıcak ay ortalaması 22 °C’dir ve bugüne dek sıcaklığın 18 Ocak 1964 ve 2 Şubat 1967 günlerinde -4.8 °C’ye düştüğü, 4 Haziran 1966’da 42,2 °C’ye yükseldiği saptanmıştır. Ancak bütün yıl yağışlı ve serindir. Artvin'in genelinde görülen Türkiye'de Karadeniz iklimi, Şavşat'ın, Ardanuç'un ve merkez ilçenin rakımı yüksek olduğu yerlerde kışları daha sert geçer. Bu bölümde ise en soğuk ay ortalaması 3.4 °C, en sıcak ay ortalaması ise 21,1 °C olup, bugüne dek en düşük sıcaklık 14 Ocak 1950’de -16.1 °C ,en yüksek sıcaklık ise 18 Ağustos 1961’de 43 °C olarak saptanmıştır.[8]",
                                                            "After the first capture of the city by the Turks under the emirate (Beylik) of Menteşe (Menteshe), whose lands extended towards the south, who named it for a first period as Güzelhisar, literally \"the beautiful castle\" (sometimes rendered as Guzel Hissar). The city was later taken over by Turks of the Aydinids, whose lands extended towards the north, who named it after Aydinid dynasty. \"Aydın\" meant \"lucid, enlightened\" in Turkish and in a distinct evolution of the term, came to mean \"lettered, educated, intellectual\" in modern Turkish. It is still a popular male name.\n" +
                                                                    "\n" +
                                                                    "In ancient Greek sources, the name of the city is given as Anthea (Ανθέα) and Euanthia (Ευανθία). During the Seleucid period, it received the name Antiochia (Greek: Αντιόχεια). At other times it was also called Seleucia ad Maeandrum (Σελεύκεια επί του Μαιάνδρου) and Erynina (Ερυνίνα).[4] In Roman and Byzantine times, it was known as Tralles (in Latin) or Tralleis (Τράλλεις in Ancient Greek), and was one of the largest Aegean cities in antiquity. There is some indication that it once bore the name Charax (Χάραξ), but that name may have belonged to Acharaca.[5][6]\n" +
                                                                    "\n" +
                                                                    "Nevertheless, the name Güzelhisar was used throughout the early centuries of the Ottoman administration as well, often recorded in adjectival form, as \"Güzelhisar of Aydın (lands)\", but the name Aydın was increasingly preferred. This previous Turkish name also found its way into the international trade vocabulary until at least the end of the 18th century and its modified forms Joselassar and even Joseph Lasat were used to describe a fine type of cotton produced in this same region and much sought after.[7]\n" +
                                                                    "\n" +
                                                                    "History\n" +
                                                                    "Antiquity\n" +
                                                                    "According to Strabo Tralles was founded by the Argives and Trallians. Along with the rest of Lydia, the city fell to the Persian Empire. After its success against Athens in the Peloponnesian War, Sparta unsuccessfully sought to take the city from the Persians, but in 334 BC, Tralles surrendered to Alexander the Great without resistance and therefore was not sacked. Alexander's general Antigonus held the city from 313 to 301 BC and later the Seleucids held the city until 190 BC when it fell to Pergamon. From 133 to 129 BC, the city supported Aristonicus of Pergamon, a pretender to the Pergamene throne, against the Romans. After the Romans defeated him, they revoked the city's right to mint coins.\n" +
                                                                    "\n" +
                                                                    "Tralles was a conventus for a time under the Roman Republic, but Ephesus later took over that position. The city was taken by rebels during the Mithridatic War during which many Roman inhabitants were killed. Tralles suffered greatly from an earthquake in 26 BC. Augustus provided funds for its reconstruction after which the city thanked him by renaming itself Caesarea.\n" +
                                                                    "\n" +
                                                                    "Strabo describes the city as a prosperous trading center, listing famous residents of the city, including Pythodoros (native of Nysa), and orators Damasus Scombrus and Dionysocles. Several centuries later, Anthemius of Tralles, architect of the Hagia Sophia in Constantinople, was born in Tralles.\n" +
                                                                    "\n",
                                                            "Close to modern Balıkesir was the Roman town of Hadrianutherae, founded, as its name commemorates, by the emperor Hadrian.[4] Hadrian came to the region in A.D. 124, as a result of a successful bear hunting he had established a city called his name here. It is estimated that the city consisted of the castle, the homestead, the stud and a few homes. It is thought that the small town was where the current stadium is present.[5]\n" +
                                                                    "\n" +
                                                                    "Members of the Roman and Pre-Byzantine dynasty had used this castle as a vacation area and for hunting. During the Byzantine period, the small town which had become increasingly neglected was known as Palaeokastron (Greek: Παλαιόκαστρο) meaning Old Castle.[6]\n" +
                                                                    "\n" +
                                                                    "Also, when the Turkmens came from Middle Asia to Mysia, they called it Balukiser because of the remains of the castle, as Hisar is the Turkish word for castle. Balıkesir's former name was Karasi because Balıkesir city was founded by Karasi Beg in the 13th century as using the remains of the small town. 1297 is considered as the date of establishment of the city which was one of the few to be founded by the Turks in Anatolia. The Karasids was a Turkic principality in Mysia. Since the 13th century, Balıkesir city have been the administrative centre of the Mysia region.\n" +
                                                                    "\n" +
                                                                    "In 1345, Balıkesir city was annexed by the Ottomans. In 1898 an earthquake destroyed much of the city. The number of buildings that were not destroyed in the 1898 earthquake was only 51.[7] In 1914, Turkish students marched through the streets of the city singing a song of hatred against the Greeks.[8] In April 1916, the Christian refugees of the villages in the vicinity of Balikesser underwent persecution from the Turks. They were refused bread on payment. The women were told that they should become Muslim so as not to die of hunger.\n" +
                                                                    "\n" +
                                                                    "At the beginning of June, many young Greeks were forced by the authorities to convert to Islam at Government headquarters.[8] On 30 June 1920 Balıkesir city was conquered by the invading Greeks but on 6 September 1922, the Turkish army took back the city. During the Turkish War of Independence, Balıkesir was the main centre of the militias in Western Anatolia against Greeks.\n" +
                                                                    "\n" +
                                                                    "On 3 August 1950, a major fire destroyed the centre of the city which was rebuilt later. That fire destroyed an important part of the city. According to estimates, it was the result of the firing of firecrackers belonging to child guns in a shop. According to another opinion, it was caused by the gnawing of the firecrackers of child guns by rats and this fire spread to the electrical contact. 498 shops completely burned. It is the second biggest disaster to befall in Balıkesir after the 1898 earthquake. Nearly a thousand people were unemployed. The tents were set up by the Turkish Red Crescent and food aid was provided for a long time.",
                                                                    "BİLECİK TARİHÇESİ\n" +
                                                                            "\n" +
                                                                            "Günümüz yerleşimiyle ilgili bilgiler sınırlıdır. Şehrin 4 km güneybatısında yerleşimin M.Ö 3000'lere kadar uzadığı düşünülen Agrilion antik kenti bulunmaktadır. Günümüz yerleşimin Hamsu ve Debağhane dereleri arasındaki kayalık çıkıntıda Bizans döneminde Belekoma adıyla bilinen bir kale bulunmaktaydı. 13. yüzyılda Bizans'ın Selçuklularla mücadelesinde uç bölgesinde yer alan Bilecik, yüzyılın ortalarından itibaren tekfur idaresinde merkezden yarı bağımsız olarak yönetilmekteydi. Bilecik, 1299 yılında ani bir baskınla Osmanlı topraklarına katıldı. Bilecik'in ele geçirilmesiyle Osman Gazi burada bir mescid yaptırmış, küçük oğlu Ali ve eşi ile aynı zamanda eşinin babası olan Şeyh Edebali burada yaşamıştır. Şehir kalenin etrafında gelişim göstermekle birlikte, coğrafi yapıdan dolayı yeterli büyüme sağlanamamıştır. 16. yüzyılda 700 civarında küçük bir nüfusa sahip olan yerleşimin onda bir kadarını Hristiyan nüfus oluşturmaktaydı. 1649 yılındaki Avârız kayıtlarında Bilecik Ertuğrul Gazi vakıflarına ait bir kasaba olarak kaydedilmiştir. Bu dönemde yerleşim, dokuz Müslüman ve bir Hristiyan olmak üzere 10 mahalleden oluşmaktaydı. Coğrafi konumu nedeniyle tarımda yapılamayan yerleşim, bu tarihlerde demir madenciliği ve ipek dokumacılığı yönüyle gelişmişti. Osmanlı idaresinde uzun süre Sultanönü sancağına bağlı bir kaza olarak görülen yerleşim, Tanzimat’tan sonra Hüdavendigâr eyaletine bağlı bir sancak oldu. II. Abdülhamid döneminde Ertuğrul sancağının merkez kazası Bilecik, Cumhuriyet’in ilk yıllarında vilâyet oldu. 1924 yılında vilâyetin adı Bilecik’e çevrildi.\n" +
                                                                            "\n" +
                                                                            "\n" +
                                                                            "BİLECİK'İN KAÇ TANE İLÇESİ VARDIR?\n" +
                                                                            "\n" +
                                                                            "Bilecik (il merkezi)\n" +
                                                                            "Bozüyük\n" +
                                                                            "Gölpazarı\n" +
                                                                            "İnhisar\n" +
                                                                            "Osmaneli\n" +
                                                                            "Pazaryeri\n" +
                                                                            "Söğüt\n" +
                                                                            "Yenipazar\n" +
                                                                            "\n" +
                                                                            "BİLECİK'TE GEZİLECEK YERLER\n" +
                                                                            "\n" +
                                                                            "Şeyh Edebali Türbesi\n" +
                                                                            "Bilecik Müzesi\n" +
                                                                            "Bilecik Saat Kulesi\n" +
                                                                            "Köprülü Mehmet Paşa Kervansarayı\n" +
                                                                            "\n" +
                                                                            "BİLECİK YÖRESEL YEMEKLERİ\n" +
                                                                            "\n" +
                                                                            "Ovmaç Çorbası\n" +
                                                                            "Bıldırcın Kebabı\n" +
                                                                            "Parmak Köftesi\n" +
                                                                            "Cevizli Büzme Tatlısı\n" +
                                                                            "Bilecik Güveci\n" +
                                                                            "Bilecik Nohutlu Mantı\n" +
                                                                            "Bozüyük Mantısı",
                                                                        "Doğu Anadolu Bölgesi’nin en eski şehirlerinden biri olan Bingöl tarih boyunca birçok medeniyete ev sahipliği yapmıştır. Bingöl isminden önce şehir 1945 yılına kadar Çapakçur olarak anılmıştır. Rivayete göre ağrılarına şifa arayan Büyük İskender, Murat Nehri’nin kaynağından su içmiş ve ağrıları dinmiştir. Bunun üzerine pınarın yanında bir kale inşa ettirmiş ve kaleye “Cennet Suyu” anlamına gelen “Çapakçur” adını vermiştir. 1945 yılında ise şehrin hemen yanı başında bulunan Bingöl Dağı’nın ismi kente verilmiştir. Güneyde Diyarbakır, batıda Tunceli ve Elazığ, kuzeyde Erzurum ve Erzincan ve doğuda Muş illeriyle komşu olan Bingöl’ün 7 adet ilçesi vardır. Termal suları ve yüzen adası ile ilgi çeken Bingöl, güneşin doğuşunun en muhteşem haliyle izlendiği dünya üzerindeki sayılı yerlerden biridir. Kale Tepesi’nden izlenen Bingöl Dağı manzarası, özellikle gün doğumunda eşsiz ve muhteşemdir.\n" +
                                                                                "\n",
                                                                        "\u200Bİlin Coğrafik Yerleşimi ve Özellikleri\n" +
                                                                                "\n" +
                                                                                "  Doğu Anadolu Bölgesi'nin Yukarı Fırat Bölümü ile Yukarı Murat-Van Bölümündeki Bitlis, 410  33' –  430 11' doğu boylamları 370 54'- 380 58' kuzey enlemleri arasında yer almaktadır. Bitlis ili, İstanbul, Ankara,  İzmir gibi ülkemizin önemli sanayi ve ticaret merkezleri konumundaki illere oldukça uzak bir mesafededir.  Ankara'ya karayoluyla 980 km, Mersin Limanı'na 805 km, Diyarbakır'a 210 km ve Van iline 168 km  uzaklıktadır.\n" +
                                                                                "Bitlis'in  genel olarak yüzölçümü 6.707 km2  dir. Bu rakama Van Gölü'nün Bitlis ili sınırları içerisinde kalan 1.876 km2  lik kısmı ve diğer göl yüzeyleri de  dahil edildiğinde ilin yüzölçümü 8.645 km2  olmaktadır.  Bitlis bu yüzölçümü ile Türkiye topraklarının %1'ini,  Doğu Anadolu Bölgesi topraklarının ise %5,5' ini kapsamaktadır. İlimiz  doğudan Van ili ve Van gölü, güneyden Siirt ve Batman, batıdan Muş, ve kuzeyden Ağrı illeri ile çevrilidir.\n" +
                                                                                "  Bitlis ilinin topoğrafyasını Van Gölü'nün güneyinde ve kuzeyinde bulunan, genellikle volkanik bir yapı gösteren dağlar ile bunların üzerindeki düzlükler belirler. İlin güneyindeki dağlar Güneydoğu Toroslar'ın uzantısı biçimindedir. Bunlar Van Gölü'nün hemen yakınından doğan akarsu vadileriyle parçalanmıştır.Topoğrafik yapı bakımından il topraklarının %71'ini dağlar, %16' sını platolar, %3'ünü yaylalar ve %10'unu da ovalar oluşturmaktadır.\n" +
                                                                                "  Bitlis'in Hizan, Mutki, Ahlat, Adilcevaz, Tatvan ve Güroymak olmak üzere 6 ilçesi bulunmaktadır. İlimizin merkez ilçe ile beraber toplam 8  belde, 334 köy ve 290  mezrası mevcut olup, köylerin 245'i orman köyüdür. İlimiz topoğrafyasının dağlık ve engebeli olması nedeniyle  yerleşim alanları dağınık bir şekildedir.  \n" +
                                                                                "\n" +
                                                                                "Topografya\n" +
                                                                                "\n" +
                                                                                "1.Dağlar:\n" +
                                                                                " \n" +
                                                                                "   Bitlis ili Doğu Anadolu Bölgesi'nin en dağlık bölgelerinden birini teşkil etmektedir. İl arazisinin % 71'lik kısmı dağlık alanlardan oluşmaktadır. Özellikle Hizan ve Mutki İlçelerinde hiç ova bulunmamakla beraber, yüzölçümünün % 90'ını dağlık araziler oluşturmaktadır. II.Alt Bölgede bulunan  Adilcevaz ve Ahlat ilçeleri nispeten daha az dağlık olup, geniş tarım arazilerini barındırmaktadır.Güneydoğu Toroslar'ın uzantısı şeklinde olan ve ili çevreleyen dağların  yükseklikleri genellikle 2000 metreyi  aşmaktadır. Yeryüzünün sayılı volkanik dağlarından olan Nemrut ve Süphan Dağları Bitlis ili sınırları içerisinde kalmaktadır.  İlin doğusunda  Süphan Dağı  4058 metrelik doruğuyla  Türkiye'nin ikinci büyük dağıdır. Doğu Anadolu volkan dağları dizisi üzerinde bulunan Süphan Dağı, Van Gölü'nün batısında yer almakta ve  üzerinde 400 metre çapında krater bir göl bulunmaktadır. İl topraklarının kuzeyinde yer alan  Nemrut Dağı, ülkemizde etkinliği en son durmuş olan volkanik dağ olma özelliğini taşımaktadır. En yüksek noktası 2.935 metreye ulaşan Nemrut Dağı, önceleri Süphan Dağı'na yakın bir yükseklikteyken patlamalar ve değişik oluşum aşamaları sonucu bugünkü yüksekliğine inmiştir. Tatvan ilçesi sınırları içerisinde kalan Nemrut Dağı, ilin turizm potansiyeli açısından en önemli doğal varlığıdır. Nemrut Dağının 1441 ile 1443 tarihleri arasında faaliyete geçmesiyle ortaya çıkan lavlar  60 km güneye kadar yayılmıştır. Dağın üzerinde Türkiye'nin birinci, dünyanın ise ikinci en büyük krater gölü olan Nemrut Gölü bulunmaktadır.İl topraklarının kuzeyinde ve Süphan Dağı'nın batısında ise düzenli bir sıradağ görünümünde Ziyaret Dağı yer almaktadır. En yüksek noktası 2542 metreye ulaşan dağın yamaçları dik ve oldukça bozuk görünümlüdür. Volkanik yapılı bu dağlar dışında ilin güneyinde iki dağ dizisi daha bulunmaktadır. Bunlardan birincisini, Van Gölü'ne dik eğimli yamaçlarla inen ve Güneydoğu Toroslar'ın  uzantılarını teşkil eden  dağlar oluşturur. İkincisini ise Güneydoğu Toroslar'ın  uzantıları şeklindeki dağların güneyinde bulunan Kavuşşahap Dağları adıyla anılan sıradağ dizisi oluşturmaktadır.",
                                                                                "Topoğrafya :\n" +
                                                                                        "\n" +
                                                                                        "Dağlar: İl topraklarının % 56’ sını kaplamaktadır. lin güneybatı - kuzeydoğu istikametinde Bolu Dağları; en yüksek yeri 1980 m. ile Çele Doruğu, ve Abant Dağları (1748 m.), Gerede'nin kuzeyinde Arkot (1877 m.) ve Göl Dağları (1112 m.)dır. En güneyde ilk iki sıradan daha yüksek olan ve genel olarak Köroğlu Dağları (en yüksek yeri 2499 m.) adı verilen volkanik dağlar uzanır. Bolu'nun güneyindeki uzantısı Seben Dağları 1854 m. Mudurnu civarında Ardıç Dağları 1443 m. Güneydeki Çal Tepesi ise 1640 m. yüksekliğindedir.\n" +
                                                                                        "\n" +
                                                                                        "Ovalar: İl Yüzölçümünün % 8’ini kaplayan ovalar genel olarak batı – doğu istikametinde uzanırlar. 725 m. yükseltideki Bolu Ovası ve 1300 m. yükseltideki Gerede Ovaları en genişleridir. Diğer ovalar ise Yeniçağa Ovası, Mudurnu Ovası ve Göynük ilçesinin güneyinde Himmetoğlu Ovasıdır.\n" +
                                                                                        "\n" +
                                                                                        "Akarsular: Bolu’da en önemli akarsular Büyüksu, Mengen Çayı, Aladağ Çayı, Mudurnu Çayı , Göynük Suyu, Çatak Suyu ve Gerede Çayıdır.\n" +
                                                                                        "\n" +
                                                                                        "Göller : Yörede morfolojik yapının karmaşıklığı, akarsu sayısının çokluğu, yükselti farklılıkları ve eğimin fazlalığı gibi faktörler çok sayıda gölün oluşmasına neden olmuştur. Havzaların ve çanakların yüzölçümlerinin küçüklüğü göllerin de küçük alanlı olması sonucunu doğurmuştur. Abant Gölü, Yeniçağa, Çubuk, Sünnet, Yedigöller, Karagöl, Sülüklügöl, Karamurat en önemli göllerdir.\n" +
                                                                                        "\n" +
                                                                                        "İklim : Bolu genellikle Batı Karadeniz ve Karadeniz iklim tiplerinin içinde yer almaktadır. Bunun yanında güneybatı bölümlerinde Marmara ve İç Anadolu iklim tipleri de görülmektedir. Son 52 yıllık verilere göre ortalama günlük güneşlenme süresi 5 saat 49 dakika, yıllık yağış 536 mm. yıllık ortalama yağışlı gün sayısı ise 137 gündür.\n" +
                                                                                        "\n" +
                                                                                        "Bitki Örtüsü :Bolu'da hakim bitki örtüsü ormanlardır. İl topraklarının %65'i ormanlarla kaplıdır. Karadere, Seben ve Aladağ Ormanları yurdumuzun en zengin ormanlarıdır. Hakim ağaç türleri kayın, gürgen, ıhlamur, dişbudak, meşe, kızılağaç, karaağaç, kavak, köknar ve sarıçamdır.\n" +
                                                                                        "\n" +
                                                                                        "Ulaşım:\n" +
                                                                                        "\n" +
                                                                                        "Ankara–İstanbul karayolu üzerinde bulunan Bolu’ya sadece kara yolu ile ulaşım sağlanabilmektedir.\n" +
                                                                                        "\n" +
                                                                                        " \n" +
                                                                                        "\n" +
                                                                                        "Tarihçe:\n" +
                                                                                        "\n" +
                                                                                        "M.Ö. 1200’lü yıllarda bütün Hitit toprakları gibi Bolu da Friglerin elindeydi. M.Ö. 6. asırda Persler bölgeye hakim oldular. M.Ö. 336’da Büyük İskender Persleri yenerek Anadolu’nun bir çok yeri gibi Bolu’yu da ele geçirdi. Büyük İskender’in ölümü üzerine Makedonya yıkılınca Bolu bölgesinde Bitinya Krallığı kuruldu. Yazılı belgeler, o dönemlerden kalan arkeolojik eserler ve tarih kaynaklarına göre, Trak göçleri sonunda Sakarya ve Filyos Nehrinin yayı içine yerleşen halk \"Bithyn\" ismi ile anılıyordu. Bu yüzden Bolu'nun da içinde bulunduğu Kuzeybatı Anadolu'ya \"Bithynia\" denilmiştir. Bithynler tarafından Salonia Campus denilen Bolu Ovası ve çevresinin adı Romalılar tarafından “Claudio Polis” olarak değiştirilmiştir. Bolu isminin de “Polis”ten geldiği sanılmaktadır. Üç tepe üzerinde kurulmuş olan şehir içte ve dışta surlara sahipti. Şehrin kuzeyinde Halı Hisarı bölgesinde bu surların kalıntıları görülebilmektedir. 1071 Malazgirt zaferinden sonra batıya yayılan Türkmenler 3 yıl sonra Bolu’ya yerleştiler. Selçuklu Devleti’nin komutanları Artuk, Tutuk, Danişmend, Karateki ve Saltuk Beyler Süleyman Şah’ın emrinde İstanbul sınırına dayandılar. Bu akınlar sırasında Bolu, Horasanlı Aslahaddin tarafından fethedilmiştir.\n" +
                                                                                        "\n" +
                                                                                        "Bolu Yöresine Osmanlı akını ilk kez Osman Gazi tarafından başlatılmıştır. Bolu yöresinin tümüyle fethedilmesi ise Orhan Gazi döneminin ilk yıllarına (1324 - 1326) rastlar. Bir başka rivayete göre Osmanlılar zamanında bölgede, bol olarak Uluğ - Alim olması nedeniyle önceleri “Bol Uluğ”, zamanla yöre “BOLU” olarak isimlendirilmiştir. Yıldırım Beyazid'in ölümü ile başlayan şehzadeler savaşına Bolu, birçok kez sahne oldu. Bolu, Ankara Savaşı sonrası Timur’un talan ettiği bölgelerin dışında kaldığı gibi, bu tehlike bitinceye kadar, Osmanlı Devleti’nin 2. kurucusu sayılan Çelebi Mehmet’i de Kızık Yaylasında barındıran belde olmuştur. Çelebi Mehmet’in Osmanlı Devleti’nin birliğini sağlamasından sonra ise Bolu, düzenli bir yönetime kavuştu.\n" +

                                                                                        "\n" +
                                                                                        "1324 – 1692 yılları arasında Bolu, 36 kazası olan bir sancak beyliği idi. XVI. Yüzyılda Bolu, ikinci derece Şehzade sancaklarından biri oldu. 2. Bayezit döneminde Şehzade Süleyman (Kanuni) buraya atandı. 1683-1792 yılları arasında Bolu, Voyvodalıkla yönetildi. II. Mahmut zamanında ise Mutasarrıflığa dönüştürüldü. (1811) Tanzimat sonrası Bolu; Kastamonu eyaletine bağlandı (1864). 1909 yılında ise tekrar Mutasarrıflığa dönüştürüldü.\n" +
                                                                                        "\n" +
                                                                                        "Mondros Mütarekesi’nin yürürlüğe girmesi ve İzmir’in işgal edilmesinin ardından Bolu yöresinde ilk Müdafa-i Hukuk Cemiyeti Gerede’de örgütlendi. Bolu 1. Dünya Savaşı’nda ve sonrasında düşman işgaline uğramadı fakat maddi zarar gördü. Mustafa Kemal Paşa önderliğinde yapılan milli mücadele dönemlerinin sonunda Bolu, 10 Ekim 1923'de Mutasarrıflık devrini tamamladı ve vilayet haline getirildi.",

                    "Klasik Grek Çağın'da Psidya olarak isimlendirilen bu bölgeye Türklerin gelişi 1071 Malazgirt Meydan Muharebesi'ne dayanır. Bugünkü Burdur toprakları Anadolu Selçuklu Devleti idaresinden sonra Hamitoğulları Beyliği eline geçmiş. 1391 yılında Yıldırım Beyazıt tarafından Osmanlı topraklarına katılmıştır. 1852’de yapılan yöresel idare reformu ile Burdur Sancağı olmuş ve Cumhuriyetle birlikte 11 merkezi olmuştur. Şu anda Burdur ili, merkez ilçeyle birlikte 11 ilçeden oluşmaktadır.\n" +
                    "\n" +
                    "Burdur ilinin 1926'ya dek tek ilçesi Tefenni iken, o yıl Bucak da ilçe yapılmıştır. 1936'da ise Yeşilova ilçe olmuştur. Tefenni'nin nahiyesi olan Gölhisar 1952'de, Ağlasun ise 1958'de ilçe yönetim merkezi olmuşlardır. İlçe sayısı 1980'li yıllara kadar 5 olarak kalmış ve 1988’de Karamanlı ve Kemer, 1990'da da Altınyayla, Çavdır ve Çeltikçi'nin ilçe merkezi olmasıyla bu sayı 10'a ulaşmıştır. Burdur ili 36-53 ve 37-50 kuzey enlemleri ile 29-24 ve 30-53 doğu boylamları arasında yer alır. Burdur, Göller Yöresi veya Göller Bölgesi adı verilen bölgede yer almaktadır.\n" +
                    "\n" +
                    "İlin doğal yapısı oldukça engebelidir. İl arazisinin\n" +
                    "\n" +
                    "%60,6’si dağlık,\n" +
                    "%2,7’si yayla,\n" +
                    "%19’u ova ve\n" +
                    "%17,6’si engebelidir.\n" +
                    "Burdur ili tümü ile 950 metre üzerindedir ve genel yüksekliği (ortalama) 1000 metredir. Burdur'a\n" +
                    "\n" +
                    "güneyden Batı Torosların uzantıları üzerindeki Boncuk Dağları, Elmalı Dağı ve Katrancık Dağı,\n" +
                    "doğudan yine Batı Torosların uzantısı olan Kuyucak ve Dedegöl Dağı,\n" +
                    "kuzeyden Burdur Gölü ve Karakus Dağı sırası,\n" +
                    "batıdan ise Acıgöl ve Eseler Dağları gibi doğal sınırlarla çevrilmiştir. En yüksek yeri ise 2598 metrelik Koçaş Dağıdır.\n" +
                    "Burdur ili topraklar genelde killi ve kireçlidir.\n" +
                    "\n" +
                    "Burdur güneyde Antalya, batıda Denizli, güneybatıda Muğla, kuzeyde Afyonkarahisar ve kuzeydoğuda Isparta illeri ile sınırlıdır.",
            "“DÖRT MEVSİM BURSA”\n" +
                    "\n" +
                    "\n" +
                    "         Köklü geçmişi ile tarih ve kültür kenti; Büyük Cihan Devleti Osmanlı’nın ilk başkenti Bursa… Birçok uygarlığı bağrına basmış bir anne… Roma, Bizans, Selçuklu’dan Osmanlı’ya geçiş, Osmanlı ile Cumhuriyet dönemlerinin mekânsal ve mimari özelliklerini günümüze taşıyan kültür ve tarih kenti, aynı zamanda ilklerin şehri Bursa…\n" +
                    "\n" +
                    "Festivalleri, otantik ve kırsal kesimdeki etkinlikleriyle halk oyunları, Hacivat-Karagöz’ü, mehteri ve kılıç-kalkanıyla kültür-sanat şehri Bursa…\n" +
                    "\n" +
                    "İznik Çinisi ile zaman tünelinde 15. – 16. yüzyılı bulursunuz Bursa’da, Bitinya, Roma ve Osmanlı Dönemi’nin eşsiz eserlerinin zenginliği ile göz kamaştıran Bursa; tarih, kültür ve inanç turizminin yanında termal turizm açısından  Türkiye’nin en önemli kentlerinden biri, hemen yanı başındaki Uludağ ile Türkiye’nin en büyük kış ve doğa sporları merkezi, Marmara’nın göz bebeği, turizm cenneti Bursa …\n" +
                    "\n" +
                    "            İznik ve Uluabat Gölleri, bütün ihtişamı ile Bursa’ya tanıklık eden Uludağ, şifalı termal suları, Oylat Kaplıcaları, Kükürtlü ve Tümbüldek Kaplıcaları, Saitabat ve Suuçtu Şelaleleri, geniş verimli ovaları ve özellikle zengin bitki örtüsü, mağaraları ile doğa harikası, yeşil Bursa…\n" +
                    "\n" +
                    "Doğal güzelliklerle yetinmeyip sanayi ve teknolojisini dünyanın ileri ülkeleri ile eşit düzeye yükselten sanayi ve ticaret merkezi, Türkiye’nin dördüncü büyük kenti Bursa… \n" +
                    "\n" +
                    "İpek böceği, kozası, ipeği ve tekstili ile Bursa…\n" +
                    "\n" +
                    "Marka kenttir Bursa…\n" +
                    "\n" +
                    "UNESCO dünya kültür mirasıdır…\n" +
                    "\n" +
                    "Dünya kenti yolunda ilerleyen Osmanlı şehri Bursa…\n" +
                    "\n" +
                    "Avrupa Kenti ödüllü Bursa…\n" +
                    "\n" +
                    "         Avrupa Tarihi Termal Kentler üyesi Bursa…\n" +
                    "\n" +
                    "Dünya coğrafyasında açık hava müzesi Türkiye’nin kültür kalbi Bursa… \n" +
                    "\n" +
                    "Bursa da yaşamak… Genç kızların, Bakırcılar Çarşısı’ndan çeyiz alışverişi yaparken ki heyecanı, kuyumcular çarşısındaki ışıltı ve gösteriş merakıdır. İskender Kebabı’nın lezzeti, kestane şekerinin damakta bıraktığı doyumsuz tada alışkın olmak, kahvaltıda Gemlik zeytini ile ekmeğin yeterli olduğunu söyleyebilmektir. Yemeğin üzerine Kemalpaşa Tatlısı istemek, sulu şeftalisini yiyen birini gördüğünde özenme hissidir. İnegöl’de mobilyacıları gezerken, köfte yemeyi düşünmektir. Karacabey’den geçerken bir çuval soğan almaktır. Mudanya’da denizin havasını içine çekip rahatlamak, Atatürk’ün av köşkü Hünkar’da çay içerken tüm yorgunluğunu atabilmektir. Tophane sırtlarında Osman Gazi ve Orhan Gazi Türbelerinden Ulucami ve Hanlar Bölgesi’ni seyredebilmektir. Uludağ’da kayak yaparken hissettiğin özgürlüktür. Ramazan eğlencelerinden sonra sahur yapmak, yeşil çinilerindeki kırmızı lalelere sinen Kur’an sesleri ile bezenmiş olan Yeşil Cami’de huzur bulmaktır. Hacivat ile Karagöz’ün meşhur atışmalarını kulağınızda duymak ve gülümsemektir.  Cumalıkızık ile 700 yıllık tarihe yolculuk yapmak, İznik surlarının gölgesinde İznik Gölü’nü seyretmek, Uludağ’ın arka yüzü; Keles, Orhaneli, Harmancık, Büyükorhan’ da renkli kıyafetleri ve el sanatları ile yörük kültürü yaşamaktır, Dağyenice, Yenişehir, Mudanya, Tirilye, Gölyazı ilçe ve beldeleriyle can içinde canandır Bursa…\n" +
                    "\n" +
                    "Şeftalisi, çileği, kirazı, ahududusu, armudu, inciri, zeytini, kestanesi… Kebabı, köftesi, hünkarbeğendisi, Kemalpaşa Tatlısı, Cennet Künkü ile ülkemin ağız tadı, sebze ve meyve cenneti Bursa…\n" +
                    "\n" +
                    "Sonbaharda, Kapalıçarşı’nın tarih kokan bir fincan kahvesidir Bursa, kış mevsiminde ipeğe sarınmış nazlı bir gelin olur… İlkbaharda çocukların cıvıltısıyla dans eden, kaynağını Ulu bir dağdan alan serin bir sudur… Belki de 600 yaşında yeşeren koca bir çınar… Yazın ise, şanlı Türk bayraklarıyla süslenmiş, Marmara’da süzülen keyifli bir feribot…\n" +
                    "\n" +
                    "Doğal zenginlikler yeşil doku,  bine yakın anıt ağaç ve termal sularıyla şifalı kaplıcalara sahip “Yeşil Bursa” olarak ün salan bu tarihi kent, günümüzde olduğu gibi geçmişte de birçok gezginin ve tarihçinin ilgisini çekmiştir. Hz. Süleyman’ın; ”İşte Cennet Burası” dediği Bursa… Yeşil ve mavi yanında, aynı zamanda turkuazdır, erguvandır Bursa… Bal sarısı, zümrüt yeşili, narçiçeği rengimizle bir başkadır Bursa…\n" +
                    "\n" +
                    "Bursa’nın Emirsultanı, Emirsultan’ın Erguvanı, Süleyman Çelebi’nin:\n" +
                    "\n" +
                    "“Ey azizler işte başlarız söze,\n" +
                    "\n" +
                    " Bir vasiyet kılaruz illa size” mevlidi,\n" +
                    "\n" +
                    " Çelebi Mehmet’in Yeşil Türbesi… Geyikli Baba (Babasultan),  Cezayirli Emir Abdülkadir’in özlemle andığı,  manevi iklimi ile büyük alim ve din adamlarının yetiştiği  “Ruhaniyetli Şehirdir” Bursa…\n" +
                    "\n" +
                    "           Evliya ÇELEBİ’nin beş kez ziyaret ettiği ve kendi ifadesiyle “Velhasıl Sudan İbarettir Bursa”… Bursa’nın suyu ile tokalaşmak güvendir, berekettir, şifadır. Havlusuyla tanışmak ayrıcalıktır, huzur verir. Havasını solumak ise tarihin bir sırrını paylaşıyormuş gibi hissettirir bazen..\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "İLÇELER:\n" +
                    "\n" +
                    "Bursa ilinin ilçeleri; Osmangazi, Nilüfer, Yıldırım,  Büyükorhan, Gemlik, Gürsu, Harmancık, İnegöl, İznik, Karacabey, Keles, Kestel, Mudanya, Mustafakemalpaşa, Orhaneli, Orhangazi ve Yenişehir'dir.\n" +
                    "\n",
            "Antik çağdan kalan Troya kalıntıları il sınırları içerisindedir. Bölgede ilk yerleşim yaklaşık 6000 yıl öncesindeki Bakır Çağı'na dayanır.[6] Fakat bu dönemde şehrin kimliği ve yaşayan insanların özellikleri hakkında pek bir şey bilinmemektedir. Yapılan kazı çalışmaları ve çeşitli araştırmalara göre, bölgedeki ilk kalıcı yerleşim izi Kumtepe civarında bulunmuştur. MÖ 4.800 - 4.000 arasına tarihlenen Kumtepe Höyüğü, bu tarihten sonra da çeşitli yerleşim izleri içeren tabakalara sahiptir.[7] Bölgedeki kazılar ilk olarak 1934 yılında Cincinnati Üniversitesi'nden  J.L. Caskey ve J. Sperling tarafından yapılmıştır. MÖ 3000 yılında kurulan Troya geçirdiği depremden sonra MÖ 2500 yılında yıkılmıştır.[8] Sonraki yüz yıllarda çeşitli göçlerle kavim dengesi değişen Çanakkale bölgesi, MÖ 7. yüzyılda Lidyalılar'ın hakimiyetine girmiştir.[8] MÖ. 6. yüzyılın ortalarında bölgede Pers egemenliği başlamıştır.[9] Perslerin önemli imparatorlarından Darius ve Xerxes bölgeyi stratejik bir nokta olarak görüp, burayı ellerinde tutmayı amaçlamışlardır. Yunan tarihçi Herodot'a göre Çanakkale Boğazı üzerinde Avrupa'ya geçmek için ilk köprüyü yapan Xerxes'tir.[8][9] MÖ 386'da Spartalılar ile Persler arasında yapılan Kral Barışı sonucu Persler bölgede hakimiyetini güçlendirdi.[10] MÖ 334 yılında Makedonya Kralı Büyük İskender bu bölgeyi Perslerin elinden almak istiyordu. Bu amaçla Çanakkale Boğazı'nı geçerek bugünkü Karabiga yakınlarındaki Kocabaş Çayı (Granikos)'nda iki ordu birbiri ile karşılaştı ve aldıkları büyük bozgun karşısında Persler bölgeyi Büyük İskender'in hakimiyetine bırakarak bölgeden çekilmek zorunda kaldılar.[9] Ancak İskender'in ani ölümü üzerine bölgeyi ünlü komutanlarından Antigonos yönetmeye başlamıştır. O da uzun süre yönetemeden, Balkanlardan gelen Kelt kökenli Galatlar, bölgeye yerleşmişlerdir.[9] MÖ 133'te Bergama Kralı III. Attalos'un vasiyeti üzerine Roma hakimiyetine giren Çanakkale, sonrasında Asia eyaletine bağlanmıştır.[11] Roma İmparatorluğu'nun 395'te Doğu ve Batı diye ikiye ayrılmasından sonra, bölge daha sonradan Bizans adıyla anılacak olan Doğu Roma İmparatorluğu'nun hakimiyetine girmiştir.[11] İmparator Justinian modern Eceabat yakınlarındaki Sestos bölgesinde boğazın kontrolünü sağlamak amacıyla kale inşa ettirmiştir. Bölgede ilk Türk hakimiyeti 11. yüzyıl sonlarında ünlü deniz komutanı Çaka Bey'in seferleri ile başlamıştır. Sonrasında Karesi Beyliği ile devam eden Türk hakimiyeti, 1361 yılında beyliğin savaşsız bir şekilde Osmanlı İmparatorluğu'na katılması ile bölgede yaklaşık 6 asır sürecek bir Osmanlı dönemi başlamış oldu.[11]",
            "Çankırı, İç Anadolu Bölgesinin Doğu-Batı doğrultusunda kısmen Karadeniz bölgesine geçişinde yer almakta olup uzunluğu 130 km, genişliği ise 80 km'dir. Yüzölçümü  (749.000 ha) 7.490 km2 olup Türkiye yüzölçümünün %1'ini oluşturmaktadır.\n" +
                    "\n" +
                    "Tarıma elverişli araziler genellikle engebelidir. Doğusunda Çorum, batısında Bolu, kuzeybatısında Karabük, kuzeyinde Kastamonu, güneyinde ise Ankara ve Kırıkkale İlleri ile komşudur. İlin Güneydoğu kesiminde yer alan Kızılırmak Havzasında düz ve geniş sulanabilir taban araziler bulunmaktadır. Bölgenin diğer kısımlarında ise orman, mera ve meyilli araziler ile küçük vadilerle sınırlı taban araziler mevcuttur.\n" +
                    "\n" +
                    "Tarıma uygun sahalarda ise kuru tarım sistemi uygulanmaktadır. 268.580 ha tarım alanının % 9,7'si olan 25.900 ha' lık arazi sulaması yapılmaktadır.\n" +
                    "\n" +
                    "İlimize bağlı yerleşim birimleri merkez ilçe hariç 11 ilçe, 3 Belde ve 371 köyden oluşmaktadır.\n" +
                    "\n" +
                    "             \n" +
                    "\n" +
                    "Doğal Durumu\n" +
                    "\n" +
                    "İç Anadolu Bölgesinin kuzey geçit kesiminde yer alan İlimizin Rakımı 550 – 2565 m arasında değişmekte olup, Merkez İlçenin rakımı 750 metredir. İlin genel jeolojik yapısının oldukça dağlık ve engebeli oluşu tarım açısından dezavantaj olarak görülmektedir.\n" +
                    "\n" +
                    "İrili ufaklı 18-20 dağın mevcut olduğu bu engebelikler İl yüzölçümünün % 60'nı oluşturmaktadır. En alçak dağ 1050 metre ile Bozkır dağı, en yüksek dağı ise 2587 metre ile Ilgaz dağıdır.\n" +
                    "\n" +
                    "İlimizde Kızılırmak havzasındaki ova dışında önemli bir ovamız bulunmamaktadır. Kızılırmak havzası ovası İlimizde yaklaşık Kızılırmak kenarında 30 km uzunluğundadır. Bunun dışında Devrez çayı, Tatlıçay, Çerkeş ve Orta ilçesinde vadi şeklinde düz araziler (ovalar) mevcuttur.\n" +
                    "\n" +
                    "Yükseltilerin hakim olduğu İlimizde yayla olarak, Ilgaz Mülayim ve Kırkpınar, Yapraklı yaylası, Taşyakası, Aydos ve Dumanlı dağları bünyesinde Sanı, Eldivan, Aydos, Ali özü ve Karapazar yaylaları mevcuttur.\n" +
                    "\n" +
                    "Akarsu ve Göller\n" +
                    "\n" +
                    "İlin kuzey batısından gelen Tatlıçay bir kavis çizerek kenti ikiye ayırırken kuzey doğusundan gelen Acıçay ve Tatlı çay birleşerek Acısu adını alarak Kızılırmak nehrine karışmaktadır.\n" +
                    "\n" +
                    "İlimizin en önemli akarsuyu Kızılırmak'tır ve Türkiye'nin en uzun ırmağıdır. Diğer akarsularımız ise Terme (Şabanözü çayı), Devrez, Melan (soğanlı), Uluçay (Çerkeş çayı) ve Acı çaydır.\n" +
                    "\n" +
                    "Çankırı İl sınırları içinde önemli büyüklükte bir göl bulunmamaktadır. İlimizde Kamış, Hacılar, Uzun, Bozyaka, Yayla, Hasır, Dumanlı, Pazar, Büyük, Dipsiz, Çöp, Bakkal, Gül, Sülük ve Kadıgil gölleri mevcuttur. Ayrıca tarım ve hayvancılığa yönelik olarakta; Eldivan Seydi, Karadere, Saray, Şabanözü, Mart, Karaören, Kurşunlu Dumanlı, Korgun Maruf, Yapraklı Gürgenlik göletleri vardır.\n" +
                    "\n" +
                    "İlimizde yine içmesuyu amaçlı olarak tamamlanmış Güldürcek barajı ve sulama amaçlı inşaatı devam eden Koyunbaba ve kızlaryolu barajı bulunmaktadır.\n" +
                    "\n" +
                    "   \n" +
                    "\n" +
                    "Meteorolojik Değerler\n" +
                    "\n" +
                    "Son beş yıllık meteorolojik verilere göre ilimiz de ortalama sıcaklık 12,1 0C olup ortalama yağış miktarı m2 ye 522,2 mm.'dir. Yine aynı verilere göre yağışlı gün sayısı 129 ve donlu gün sayısı 77 dir.\n" +
                    "\n" +
                    "Nüfus \n" +
                    "\n" +
                    "2018 adrese dayılı nüfus sayımı ve TUİK verilerine göre, Çankırı İlinde toplam nüfus 216.362 olup, bu nüfusun %38,85' İ olan 84.065 kişi kırsal alanda yaşamaktadır.\n" +
                    "\n" +
                    " İl Merkezinin nüfusu 84.331 olup merkeze bağlı köylerde de 11.694 kişi olmak üzere il merkezinde toplam 96.025 kişi yaşamaktadır. İlimiz genelinde çalışan nüfusun % 48,6'sı tarımda istihdam edilmektedir.  İl genelinde km2 ye 28.88 kişi düşmektedir.\n" +
                    "\n" +
                    "Tarihi ve Turistik Mekanlar\n" +
                    "\n" +
                    "Ilgaz Kadın Çayırı Yıldız Tepe   \n" +
                    "\n" +
                    "Ilgaz Dağı'nın eteklerinde kurulmuş olan Çankırı'nın güzide İlçesi, adına şiirler yazılan, türküler bestelenen Yeşil Ilgaz, tarihi, kültürü, mimari ve doğal güzellikleri, coğrafyası ve tarihiyle her zaman dikkatleri üzerine çekmiştir. Kışın beyazın maviyle buluştuğu yerde kış sporlarının, yazın yeşilin gökyüzü ile birleştiği yerde doğa sporlarının yapıldığı \"Çankırı'nın İncisi Ilgaz\", Karadeniz'i İstanbul'a bağlayan uluslararası E 80 Devlet Karayolu ile Ankara-Çankırı-Kastamonu-Sinop'u birbirine bağlayan D 765 Devlet Karayolunun kesiştiği noktada yer alması, büyük kentlere yakın olması ve onlarca arkeolojik alan ve sivil mimari örnekleriyle tarih, doğa ve kış turizminin önemli merkezlerinden birisidir. Ilgaz-Kadınçayırı Mevkiinde 2006 yılında Kültür ve Turizm Koruma ve Gelişim Bölgesi ilan edilen Yıldıztepe, bölgenin yeni cazibe merkezidir. Ilgaz'a 20, Çankırı'ya 70, Ankara'ya 200 km mesafedeki bölgeye,Ilgaz-Kastamonu karayolunun 13. Kilometresinden doğuya ayrılan 7 kilometrelik asfalt bir yolla ulaşılmaktadır.Yeşilin her tonunun görülebileceği alan yaz mevsiminde bir orman denizi görünümündedir. Kışın bu denizin üzeri beyaz bir örtüyle kaplansa da yeşilin etkisi asla kaybolmaz. Kayak ve diğer kış sporları, yaya ve atlı yürüyüş, dağcılık, karavan,kamp ve eğitim gibi her türlü doğa sporları açısından da uygun olan alan yılın oniki ayında ziyaretçi akınına uğramaktadır. 2005 yılında Bakanlar Kurulu Kararıyla \"Çankırı - Ilgaz Kadın Çayırı Yıldıztepe Turizm Merkezi\" 2006 yılında da Çankırı - Ilgaz Kadın Çayırı Yıldıztepe Kültür ve Turizm Koruma ve Gelişim Bölgesi olarak ilan edilmiştir. Yöremizin en uzun mekanik hattı ve pistine sahip olan Yıldıztepe'nin İlimizin yanı sıra Ilgaz Dağında yer alan diğer tesisleri de olumlu etkileyerek yöre turizmini hareketlendirmesi ve yatırımcıların ilgisini çekmesi kaçınılmazdır. Böylece doğa harikası olan Çankırı Ilgaz Kadınçayırı Yıldıztepe Kültür ve Turizm Koruma ve Gelişim Merkezi Türkiye'nin gözde mekânlarından biri olacaktır. Kayaklı Koşu Yarışmalarına da müsait olan Yıldıztepe'de Uluslararası Üniversiteler Kayaklı Koşu Kupası ve Türkiye Üniversiteler Kayaklı Koşu Şampiyonası yarışmaları yapılmaktadır.\n" +
                    "\n" +
                    "          \n" +
                    "\n" +
                    "Taş Mescit (Cemaleddin Ferruh Dârulhadîsi)\n" +
                    "\n" +
                    "Çankırı'da Selçuklu Dönemi'nden kalma en önemli yapıdır. Moloz taştan yapılması sebebiyle tamamen yıkılmış olan şifahane kısmı, Anadolu Selçuklu Hükümdarı I. Alâeddin Keykubat zamanında Çankırı Atabeyi (Valisi) Cemalettin Ferruh tarafından 1235 yılında yaptırılmıştır.\n" +
                    "\n" +
                    "Cemalettin Ferruh şifahaneye ilave olarak 1242 yılında bir dâr-ûl hâdis inşa ettirmiştir. Halk dilinde bu yapı Taş Mescit olarak isimlendirilmektedir. Mimari özelliğinin yanı sıra yapıya önem kazandıran bir diğer husus ise, biri yapı üzerinde, diğeri heykel görünümünde olan iki adet figürlü taş parçanın varlığıdır. Birbirine dolanmış iki yılanın tasvir edildiği ve günümüzde \"Tıp Sembolü\" olarak kullanılan birinci parça yapı üzerinde bulunmaktadır. Çankırı Müzesinde sergilenen ikinci parçada ise günümüzde \"Eczacılık Sembolü\" olarak kullanılan kupaya dolanmış yılan figürü bulunmaktadır. Eser uzun yıllar Mevlevihane olarak da kullanılmıştır.",
            "Karadeniz Bölgesinin İç Anadolu’ya açılan kapısı olan Çorum İli , Anadolu kültür mozayiği içerisinde eşsiz bir konuma sahiptir. Günümüzden 7 bin yıl öncesine ait kültürel verilere rastlanan Çorum’da, ilk organize devleti kuran Hititlerin ilk başkenti Hattuşa bulunmaktadır. Hattuşa Anadolu’nun kalbinde, UNESCO tarafından Dünya Kültür Mirası Listesine alınmış ülkemizdeki 9 değerden biridir. Hitit uygarlığı en az Mısır Uygarlığı kadar eski ve zengin bir uygarlıktır. Hititlerle Mısırlılar arasında yapılan Kadeş Antlaşması metin tabletleri Boğazköy’de bulunmuştur. Hititlerin diğer önemli kült (dini) merkezlerinden sayılan, arkeolojide Arinna olarak bilinen Alacahöyük Ören Yeri; 13 Kral Mezarı , Hatti Tunç Güneş Kursu ve Sfenksli Kapıları ile görülmeye değer tarihi bir yerdir. Ulu Önder Büyük Atatürk’ün bizzat direktifleriyle ilk milli kazılarımızın başlangıç noktası olması ile de önem arzeder.\n" +
                    "\n" +
                    "Ortaköy İlçesindeki Şapinuva ören yeri de büyük bir Hitit kenti olup, hala sürmekte olan kazı çalışmalarında bol miktarda yazılı belge ortaya çıkarılmıştır. Ayrıca, 1990 yılında başlatılan ve kongre dili Türkçe olan “Hititoloji Kongresi” her üç yılda bir düzenlenmekte olup, 6 yılda bir de Çorum’da gerçekleştirilmektedir. Bu kongreye dünyanın bir çok yerinden bilim adamı katılmaktadır. Hitit uygarlığının yanısıra, her biri sanat şaheseri olan Selçuklu ve Osmanlı Dönemine ait; cami, köprü ve kalelerle süslü Çorum, yayları ve İncesu Kanyonu gibi doğal güzellikleri ile de görülmeye değer bir yerdir. Meşhur leblebisi, Osmancık ve Kargı’da üretilen kaliteli pirinçleri dünyaca tanınmaktadır.",
            "Denizli ili, Ege Bölgesinde bir il merkezidir. Denizli 500 Bin'i aşan merkez nüfusuyla, İzmir'den sonra Ege bölgesinin en büyük kentidir. Denizli Türkiye'nin ise en büyük ve en gelişmiş on altı şehrinden biridir (kent merkezi: 537.000). Bir sanayi, ihracat ve ticaret merkezi olan Denizli aynı zamanda otuz bini aşan öğrenci sayısıyla bir üniversite şehridir. Bir yılda milyonlarca yerli ve yabancı turisti ağırlayan Denizli bir turizm kenti olmasının yanısıra düzenlenen yerel, ulusal ve uluslararası etkinliklerle (bkz. festivaller) eğitim, kongre, kültür ve sanat merkezi özelliğindedir. Güney Ege Kalkınma Ajansı'nın (Geka) merkezi de Denizli'dir.\n" +
                    "\n" +
                    "Akdağ'ın (Babadağ) kuzey yamaçları eteklerinde, Büyük Menderes'in kolu olan Aksu çayına kavuşan derelerle hafifçe yarılmış bir plato üzerinde yer alan Denizli, yeni bir kenttir. 11. yüzyıla kadar Denizli Ladik (\"Laodicaea on the Sea\") olarak adlandırılan ve su bakımından zengin bir yerleşme vardı. Asıl kent buradan 6-7 kilometre kadar kuzeydeki Laodikya (Laodicaea) idi. Selçuklular ve Bizanslılar arasındaki savaşlar sonucu yıkıma uğrayan ve özellikle suyolları bozulan Laodikeia zamanla terk edilmeye başlanmış ve yerleşme 11. yüzyıldan başlayarak bol su kaynaklarının bulunduğu Denizli Ladik'e doğru yer değiştirmeye başlamıştır. Kent 1702-1703'teki bir deprem sırasında büyük zarara uğramış ve daha sonra yeniden kurulmuştur. Ege kıyılarından iç kesimlere sokulan doğal bir yol üzerinde bulunan Denizli, özellikle 1950'li yıllarda karayollarının düzelmesinden sonra, bu konumunun ve çevresindeki tarım etkinliklerinin gelişmesi sonucu hızla kalabalıklaşmış ve 1950'de 22.000 olan nüfusu, aradan geçen 60 yıl içinde 20 katından fazla artmıştır.",

           };
    private int[] sehirlerResim = {R.drawable.adana01, R.drawable.adiyamman02, R.drawable.afyonkarahisar03, R.drawable.agri04, R.drawable.amasya05, R.drawable.ankara06, R.drawable.antalya072, R.drawable.artvin08, R.drawable.aydin09, R.drawable.balikesir10,R.drawable.bilecik112,R.drawable.bingol12,R.drawable.bitlis132,R.drawable.bolu14,R.drawable.burdur15, R.drawable.bursa1602,R.drawable.canakkale17,R.drawable.cankiri18,R.drawable.corum19,R.drawable.de };
    private String[] plakalar = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58"};

    private Intent detailsIntent;
    static public Sehir sehir;
    private Bitmap secilenSehir;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
        mListView = (ListView) findViewById(R.id.main_activity_listView);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, sehirler);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i < 20 ) {
                    detailsIntent = new Intent(MainActivity.this, DetailActivity.class);
                    secilenSehir = BitmapFactory.decodeResource(getApplicationContext().getResources(), sehirlerResim[i]);
                    sehir = new Sehir(sehirlerAciklama[i], sehirler[i], secilenSehir, plakalar[i]);

                    //Toast.makeText(getApplicationContext(), String.valueOf(i + 1), Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), sehirler[i] + " " + String.valueOf(i + 1), Toast.LENGTH_SHORT).show();
                    //Toast.makeText(getApplicationContext(), sehirlerAciklama[i], Toast.LENGTH_SHORT).show();
                    startActivity(detailsIntent);
                }
            }
        });
    }
}