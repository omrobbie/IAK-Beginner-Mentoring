package com.wirama.zodiak;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ChuPAK on 8/15/2017.
 */

public class zodiak extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak);

        String username = getIntent().getStringExtra("namauser");
        String tjk = getIntent().getStringExtra("jk");
        String tlhir = getIntent().getStringExtra("tgllhr");

        getSupportActionBar().setTitle("Selamat Datang "+ username);
        getSupportActionBar().setSubtitle(tjk+" "+tlhir);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        List<data> list = new ArrayList<>();
        list.add(new data(R.mipmap.aquarius, "Aquarius (21 Januari - 19 Februari)", "Tenang, Obyektif (Tidak Memihak), Jenius, Penuh Ide, Cepat Mengerti\n" +
                "Nomor Keberuntungan: 8, 14, 29, 35, 40, 47\n" +
                "Aroma Keberuntungan: Lavender, Lemon, Kayu Pinus\n" +
                "Planet Yang Mengitari: Uranus\n" +
                "Bunga Keberuntungan: Bunga Narsis, Bunga Pansy\n" +
                "Warna Keberuntungan: Hijau, Kuning Muda\n" +
                "Batu Keberuntungan: Batu Permata Berwarna Hijau Lumut\n" +
                "Elemen Keberuntungan: Udara\n" +
                "Pasangan Serasi: Leo\n" +
                "Para Aquarius bersifat progresif, inovatif dan penuh gagasan. Individu ini sangat progresif dalam cara berpikir, cenderung individualistik dan enggan mengikuti keramaian. Walaupun pada dasarnya mereka tidak antusias untuk menjadi pemimpin, beberapa diantaranya berhasil menjadi pemimpin. Sikapnya eksentrik, penuh keyakinan, namun keras kepala. Mereka cenderung bersikap adil. Dalam bekerja selalu penuh keseriusan, walaupun dari luar mereka nampak tenang, namun di dalam hatinya mereka sangat takut dan gugup. Aquarius suka barang-barang mewah, namun tidak serakah. Mereka tidak menyukai adat istiadat dan peraturan-peraturan kuno dalam keluarganya dan cenderung melanggar peraturan. Mereka suka mengikuti kata hatinya bila menyangkut masalah perasaan. Mereka cenderung menyakiti dirinya sendiri daripada menyakiti orang lain. Aquarius dapat menyelesaikan masalah karena mereka mampu keluar dari dilema. Mereka peduli pada hal-hal besar dan sangat manusiawi. Aquarius pribadi yang senang menyendiri, perlu banyak waktu untuk mengenal mereka karena mereka hanya membuka diri pada orang yang mereka percaya, hormati dan cintai\n" +
                "\n" +
                "Asmara para Aquarius: Kaum Aquarius tertarik pada pasangan yang memiliki kepandaian. Mereka senang mencoba termasuk mencoba hal baru dalam hal percintaan dan romantisme. Kaum Aquarius kadang bersikap dingin dan acuh namun dibalik semuanya itu dia sangat pasangan yang penuh kasih yang selalu mencoba hal baru dan lain dari yang biasanya."));
        list.add(new data(R.mipmap.pisces, "Pisces (20 Februari - 20 Maret)", "Memiliki Sisi Manusiawi Yang Besar, Penuh Cinta, Praktis, Suka Mengkhayal\n" +
                "Nomor Keberuntungan: 9, 13, 27, 32, 39, 45\n" +
                "Aroma Keberuntungan: Apel, Melati, Lily, Vanilla\n" +
                "Planet Yang Mengitari: Neptunus\n" +
                "Bunga Keberuntungan: Sedap Malam, Teratai, Lily.\n" +
                "Warna Keberuntungan: Hijau Laut, Biru Kehijau-Hijauan\n" +
                "Batu Keberuntungan: Zambrud\n" +
                "Elemen Keberuntungan: Air\n" +
                "Pasangan Serasi: Virgo\n" +
                "Para Pisces kaum yang ekstrim, sensitif dan lain dari yang lain. Mereka ingin melakukan segala sesuatunya dengan baik tetapi hal ini sulit sekali, karena mereka juga harus selalu mendengarkan kata hati mereka tentang hal-hal yang benar & salah. Para pisces penuh pesona, humor dan sipati bila berhadapan dengan orang lain sehingga menerima banyak pertolongan dari orang lain. Pisces butuh suatu wadah untuk mengembangkan bakatnya sehingga ia merasa sangat bahagia. Mereka akan frustasi bila terjebak dalam rutinitas. Mereka mudah percaya janji-janji yang diberi oleh orang lain, tanpa berpikir panjang. Kaum Pisces pandai dalam hal memainkan perasaan. Mereka menjadi sangat sensitif terhadap apa yang dipikirkan dan dirasakan orang lain, dam menjadi sangat mudah marah tanpa alasan yang jelas. Ini membuat orang lain sulit menebak perasaan mereka. Kaum Pisces pandai membujuk. Mereka senang bila pekerjaannya dihargai orang lain, bila tidak maka ia tidak akan mengerjakan tugasnya dengan benar. Pisces senang pada hal-hal yang bersifat hiburan dan bersedia menjadi tuan rumah dari setiap peristiwa atau pertemuan. Mereka terlihat malu dan tertutup namun padahal tidak. Bila mereka merasa nyaman dengan sekitarnya, mereka tidak akan ragu untuk mengambil alih.\n" +
                "\n" +
                "Asmara para Pisces: Pisces cenderung menjadi pasangan yang penuh gairah, peduli pada kebutuhan pasangannya dan ingin menyenangkan pasangannya. Mereka ahli membuat situasi menjadi terbalik dan mudah memanipulasi pasangannya. Kaum pisces paling sulit dimengerti, terutama bila itu menyangkut urusan percintaan. Mereka sering melakukan sesuatu yang berlawanan dengan perkataan mereka. Mereka perayu yang hebat dan penuh ide-ide baru yang sulit untuk ditolak dan dilupakan."));
        list.add(new data(R.mipmap.aries, "Aries (21 Maret – 19 April)","Agresif, Energik, Impulsif, Berjiwa Pemimpin, Tidak Sabaran, Egois, Cepat Emosi\n" +
                "Nomor Keberuntungan: 2,5,11,34,47\n" +
                "Aroma Keberuntungan: Lada Hitam, Cengkeh, Ketumbar, Kemtumbar, Kemenyan, Jahe, Pohon Cemara, Kayu-kayuan.\n" +
                "Planet Yang Mengitari: Mars\n" +
                "Bunga Keberuntungan: Bunga Daisy\n" +
                "Warna Keberuntungan: Merah\n" +
                "Batu Keberuntungan: Batu Delima\n" +
                "Elemen Keberuntungan: Api\n" +
                "Pasangan Serasi: Sagitarius\n" +
                "Aries adalah simbol sebuah permulaan baru. Orang Aries menjadi pemimpin zodiak-zodiak lainnya, agresif dan penuh kreativitas yang memungkinkan mereka untuk berinisiatif dalam mengadakan perubahan. Selayaknya domba jantan, mereka selalu bertindak cepat tanpa berpikir panjang terlebih dahulu. Mereka lebih senang mencari penghargaan daripada kekayaan dan biasanya lebih suka berbicara terus terang daripada berbasa-basi untuk mendapatkan apa yang diinginkannya. Kebanyakan dari mereka sukses berkat sikap mereka yang pantang menyerah. Aries merupakan orang yang penuh energi, pandai beradaptasi dan cepat belajar. Mereka memiliki banyak ide-ide cemerlang dan berambisis tinggi. Keras kepala, antusisas dan penuh orientasi. Bila mereka ingin sesuatu, tidak ada yang dapat menghalanginya. Mereka siap mengambil tindakan tanpa memikirkan resiko yang dapat mencelakakan diri mereka sendiri. Aries bukan seorang pengikut yang baik. Mereka memiliki semua kemampuan yang dibutuhkan untuk menjadi pemimpin yang baik, namun sikapnya yang suka memerintah membuat orang menjauhi dirinya.\n" +
                "\n" +
                "Asmara para Aries: Hal ini terlihat jelas apabila para Aries sedang jatuh cinta. Mereka akan mengejar apa yang mereka inginkan sampai dapat. Apabila ini terjadi pada kalian, berhati-hatilah. Aries tidak pernah mau menerima jawaban tidak. Sayangnya, jika kamu tidak bisa mengikuti jalan hidupnya, mereka akan meninggalkanmu dan berpindah ke lain hati."));
        list.add(new data(R.mipmap.taurus, "Taurus (21 April - Mei 20)", "Keras Kepala, Materialistis, Pasif, Ramah & Sabar, Praktis dan Setia, Memiliki Jiwa Toleransi\n" +
                "Nomor Keberuntungan: 12,19,23, 33, 39,41\n" +
                "Aroma Keberuntungan: Aroma Madu, Mawar, Lily, Kayu Oak\n" +
                "Planet Yang Mengitari: Venus\n" +
                "Bunga Keberuntungan: Bunga Daisy, Violet\n" +
                "Warna Keberuntungan: Coklat, Hijau\n" +
                "Batu Keberuntungan: Batu Pirus (Batu bermata biru)\n" +
                "Elemen Keberuntungan: Tanah\n" +
                "Pasangan Serasi: Scorpio\n" +
                "Taurus adalah simbol kepastian dan kehendak yang kuat. Taurus biasanya berjuang untuk mendapatkan rasa aman batiniah dan jasmaniah. Mereka memiliki selera tinggi pada pakaian, lukisan, barang-barang antik dan barang-barang mewah lainnya. Cita rasa Taurus sangat tinggi, namun cenderung konservatif. Mereka sangat menikmati alunan melodi dan musik yang indah. Taururs suka menolong orang lain dan tidak mudah marah. Mereka tidak suka didesak dan cenderung keras kepala bila terus menerus didesak. Para Taurus cenderung setia, stabil dan sabar, meskipun kadang mereka keras kepala. Mereka memiliki pandangan yang baik untuk meraih tujuan mereka sehingga mereka cukup berhasil. Mereka gigih pada keputusan yang telah diambil dan tidak ada seorangpun yang dapat merubah pendiriannya. Karena Taururs tidak suka didesak, maka banyak yang menjulukinya si Lamban. Namun demikian, kamu dapat mempercayakannya dalam membantumu keluar dari masalah. Mereka bukan tipe orang yang mudah melanggar janji dan mundur dari suatu keyakinan, dan mereka memiliki stamina dan ketekunan untuk bertahan dari lawan-lawannya. Kekuasaan Taurus sangat hebat sehingga mereka tidak mudah gagal dalam hidupnya.\n" +
                "\n" +
                "Asmara para Taurus: Para Taurus cenderung pendiam dan bergairah. Mereka berusaha untuk memberikan yang terbaik dalam hidup mereka seperti musik yang lembut, lampu yang redup, dan anggur terbaik untuk menemani mereka menghabiskan waktunya dengan orang yang mereka cintai. Taurus selalu mengutarakan hatinya secara langsung dan tidak suka bertele-tele bila menyangkut urusan cinta. Mereka berusaha menyenangkan hatimu dengan harapan mendapatkan balasan yang sama dari pasangannya."));
        list.add(new data(R.mipmap.gemini, "Gemini (21 Mei - Juni 21)", "Lincah, Pandai berbicara, Tidak Stabil, Mudah Berubah-Ubah, Mudah Gugup, Sangat Peka\n" +
                "Nomor Keberuntungan: 4,11,26,31,38.49\n" +
                "Aroma Keberuntungan: Bunga Lavender, Bunga Lily, Peppermint\n" +
                "Planet Yang Mengitari: Merkurius\n" +
                "Bunga Keberuntungan: Bunga Lily, Pakis\n" +
                "Warna Keberuntungan: Kuning\n" +
                "Batu Keberuntungan: Batu Safir\n" +
                "Elemen Keberuntungan: Udara\n" +
                "Pasangan Serasi: Sagitarius\n" +
                "Gemini adalah simbol kecerdasan, memiliki banyak akal. Komunikasi dan bahasa sangat penting bagi mereka. Mereka memiliki kemampuan berkembang dan belajar yang tinggi. Umumnya para Gemini tidak stabil, reaksi terhadap situasi ditentukan oleh mood mereka. Bagi Gemini, keragaman adalah penyedap kehidupan. Mereka menikmati hasil yang mereka capai lewat kerja keras mereka sendiri. Gemini tidak menyukai rutinitas. Pengetahuan, pikiran yang cepat dan kepandaian jelas terlihat pada zodiak ini. Mereka mudah berubah-ubah. Simbol ini memiliki pesona alami dan energi karisma yang menarik semua zodiak. Mereka memiliki banyak ide yang dapat membuat kita tertarik, namun mereka cenderung cepat bosan jika mereka berada di sekitar orang yang tidak dapat mengikuti jalan pikiran mereka, dana cepat berpindah ke suatu tempat dimana orang di sekitarnya dapat mengikuti jalan pikiran mereka. Mereka biasa menikmati hidup mereka dan jarang melihat kembali kebelakang. Gemini dikenal dengan spontanitasnya dan kemampuan mereka berbicara mengenai segala hal. Mereka energik dan murah hati. Sikap plin plan mereka terkadang menyulitkan. Kamu tidak akan pernah tahu apa yang mereka pikirkan dan apa yang akan mereka lakukan. Cobalah bertanya pertanyaan yang sama pada hari berikutnya, maka kamu akan mendapatkan jawaban yang berbeda setiap harinya. Terkadang hal ini dapat membuatmu putus asa, namun dapat juga mempesonamu.\n" +
                "\n" +
                "Asmara para Gemini: Jika kamu tidak dapat mengikuti pola pikir para Gemini, kamu tidak akan dapat bergaul dengan zodiak ini. Perubahan sikap adalah kunci memenangkan hati mereka. Gemini akan menggunakan kemampuan berkomunikasi mereka untuk merayu orang yang mereka sukai. Mereka cenderung menjauh dari orang yang tidak menantang mereka. Gemini memiliki rasa ingin tahu yang tinggi dan selama kamu dapat menimbulkan keingintahuan di hati mereka, mereka selamanya akan berada di sampingmu. Gemini menukai perubahan, mereka senantiasa mencari sesuatu yang lain, termasuk juga kekasih."));
        list.add(new data(R.mipmap.cancer, "Cancer (22 Juni - Juli 22)", "Suasana Hati Tidak Menentu, Sentimentil, Setia, Penuh Perhatian, Sulit Memaafkan, Memiliki Daya Ingat Yang Kuat\n" +
                "Nomor Keberuntungan: 5, 7, 16, 23, 28, 41\n" +
                "Aroma Keberuntungan: Bunga Melati, Lemon, Mawar, Lily, Kismis\n" +
                "Planet Yang Mengitari: Bulan\n" +
                "Bunga Keberuntungan: Bunga Lily, Mawar Putih.\n" +
                "Warna Keberuntungan: Putih\n" +
                "Batu Keberuntungan: Batu Bulan, Mutiara\n" +
                "Elemen Keberuntungan: Air\n" +
                "Pasangan Serasi: Capricorn\n" +
                "Cancer adalah pribadi yang penuh emosi, sensitif. Selayaknya kepiting mereka sangat protektif dan memiliki pertahanan diri yang tinggi. Mereka takut pada cemoohan, dan akan bekerja dengan diam-diam dibelakang layar untuk mendapatkan apa yang telah mereka rencanakan. Mereka tidak mau mengambil resiko dalam hidupnya dan selalu konsisten membayar hutang mereka. Cancer sangat mendambakan kerapian dan kebersihan. Cancer sangat simpatik terhadap orang lain oleh karena itu sulit mengerti seperti apa sebenarnya pribadi mereka. Mereka cenderung perhatian dan setia bila kamu mulai mengenal Cancer. Mereka berjiwa patriot dan sangat melindungi semua yang mereka sayangi. Mereka sangat membanggakan lingkungan tempat tinggalnya dan senang mengundang teman-temannya berkunjung di rumahnya. Kegemarannya mengumpulkan barang-barang membuat orang menjulukinya gudang tikus. Mereka memiliki ingatan yang luar biasa dan akan selalu mengingatkanmu akan hal-hal yang telah kamu lakukan di masa yang lalu, terutama hal-hal yang ingin kamu lupakan. Para cancer merupakan orang yang penuh kasih, setia dan penuh welas asih. Kebutuhannya untuk mendapatkan rasa aman dan keseimbangan dalam hidup sangat didambakan. Cancer memiliki intuisi yang kuat dan dapat mengetahui pikiran-pikiran dan perasaan yang ada pada orang-orang yang dijumpai. Mereka bisa menjadi sangat agresif jika seseorang menantang mereka, maka dari itu jangan main-main dengan kepiting kecuali kamu siap untuk dicapit oleh mereka.\n" +
                "\n" +
                "Asmara para Cancer: Zodiak ini tertarik pada kecantikan, namun demikian mereka juga mendambakan kecerdasan didalam kecantikan, karena mereka menawarkan kasih sayang, kesetiaan, dan pesona intelektualitas, mereka menyukai pasangan yang memiliki kriteria tersebut. Bila mereka telah jatuh hati padamu, mereka tidak akan pernah melepaskanmu. Mereka senantiasa melindungimu dan selalu memberikan rasa aman dan nyaman. Mereka akan selalu melakukan apapun bagi pasangannya."));
        list.add(new data(R.mipmap.leo, "Leo (23 Juli - 23 Agustus)", "Suka Memimpin, Dermawan Dan Murah Hati, Penuh Gaya, Aristokratik, Congkak, Percaya Diri Tinggi\n" +
                "Nomor Keberuntungan: 6, 14, 19, 26, 39, 42\n" +
                "Aroma Keberuntungan: Jahe, Jeruk Nipis, Jeruk, Rempah-Rempah\n" +
                "Planet Yang Mengitari: Matahari\n" +
                "Bunga Keberuntungan: Bunga Matahari, Mawar Merah, Bunga Apiun\n" +
                "Warna Keberuntungan: Merah Bata\n" +
                "Batu Keberuntungan: Berlian\n" +
                "Elemen Keberuntungan: Api\n" +
                "Pasangan Serasi: Aguarius\n" +
                "Leo adalah anggota kerajaan segala zodiak. Mereka bermartabat tinggi dan sangat dramatis, mereka sangat gagah dan penuh warna, dan suka menjadi pusat perhatian. Mereka bekerja giat di dalam susunan organisasi dan pandai membagi tugas. Rencana mereka jarang terdengar namun selalu menakjubkan. Mereka penuh percaya diri dan terus terang dalam menyatakan apa yang mereka rasakan, namun terkadang mereka mudah sekali marah. Mereka memiliki keberanian dan tidak pernah berbuat curang. Leo mempunyai pembawaan diri yang mengagumkan sehingga menarik perhatian banyak orang. Orang leo sangat terbuka, sulit bagi mereka menyembunyikan perasaan dan diri mereka sendiri. Mereka pandai beradaptasi dan perhatian pada segala hal. Mereka dilahirkan untuk menjadi pemimpin dan akan sangat kecewa bila mereka tidak memiliki kekuasaan untuk mendelegasikan tugasnya. Mereka suka hidup seperti layaknya anggota kerajaan dan bersedia melakukan apa saja yang dibutuhkan untuk mendapatkan gaya hidup yang diinginkannya. Mereka tahu apa yang harus mereka lakukan untuk membujuk orang disekitarnya melakukan apa yang diinginkan. Leo suka melakukan perbuatan yang besar dan terkenal dengan kedermawanannya. Mereka tidak pernah mundur dari suatu pertempuran dan selalu membela hak mereka dan kepercayaan mereka.\n" +
                "\n" +
                "Asmara para Leo: Leo selalu membanggakan dirinya sebagai pecinta yang hangat. Prilaku mereka nampak dengan sikapnya yang sombong dan sok kuasa tetapi sifat inilah yang membuat mereka menjadi sangat terkenal di dalam hal bercinta. Mereka tidak suka pasangan yang melebihi dirinya. Leo cenderung dermawan, pandai beradaptasi dan penuh perhatian. Mereka selalu menyenangkan pasangannya sehingga pasangannya selalu senang berada di dekatnya. Leo juga mudah cemburu bila pasangannya lebih memperhatikan orang lain daripada dirinya."));
        list.add(new data(R.mipmap.virgo, "Virgo (24 Agustus - 22 September)", "Praktis, Analistis, Kritis, Berkepala Dingin Dan Logis, Rajin, Sederhana\n" +
                "Nomor Keberuntungan: 4, 7, 16, 25, 31, 43\n" +
                "Aroma Keberuntungan: Kayu Oak, Lemon, Madu, Pohon Saru, Adas\n" +
                "Planet Yang Mengitari: Merkurius\n" +
                "Bunga Keberuntungan: Bunga Lavender, Bunga Azalea\n" +
                "Warna Keberuntungan: Biru Laut, Abu-Abu, Kuning Mustard\n" +
                "Batu Keberuntungan: Batu Topaz\n" +
                "Elemen Keberuntungan: Tanah\n" +
                "Pasangan Serasi: Pisces\n" +
                "Virgo adalah penganalisa dan pengurus organisasi yang andal. Mereka ingin segala sesuatunya dikerjakan dengan sempurna, dan selalu mendapatkan perhatian dari sekelilingnya karena kesempurnaan dan keefisienannya. Mereka pandai dalam hal mengkritik hasil kerja orang lain. Para virgo mengagumi perkembangan teknologi dan sangat gemar masakan yang lezat. Namun demikian mereka tidak lupa untuk berdiet. Ketangkasan mereka dan kemampuan mengkoordinasi melebihi rata-rata. Sikapnya penuh emosi, namun terkadang baik. Virgo selalu tampil rapi, bersih dan prima. Mereka memiliki cita rasa tinggi namun konservatif. Virgo pandai mengatur orang lain namun begitu ia tidak suka bersikap sombong terhadap orang lain. Mereka berakal panjang, menyelesaikan masalah dengan cepat. Para virgo sangat perfeksionis dan ini membuat orang disekitarnya tidak nyaman. Jika segala sesuatunya tidak berjalan seperti yang diinginkan, ia akan marah. Namun demikian mereka selalu bersedia menolong orang lain.\n" +
                "\n" +
                "Asmara para Virgo: Para virgo senang menjalin kasih dengan orang yang dianggapnya membawa banyak keuntungan bagi dirinya. Mereka perlu jaminan dari pasangannya bahwa pasangannya akan bekerja sama giatnya dengan virgo. Mereka memiliki rasa ingin tahu yang besar menyangkut cinta dan sex, dan selalu bereksperimen sebelum membuat ikatan. Sebelum menentukan pasangan, virgo harus yakin betul bahwa pasangannya dapat memenuhi segala kebutuhannya secara profesional. Dia lebih suka hidup sendiri daripada tinggal dengan orang yang tidak sesuai dengan hatinya."));
        list.add(new data(R.mipmap.libra, "Libra (23 September - 23 Oktober)", "Penuh Keraguan, Bimbang, Adil Pandai Bermuka Dua, Memiliki Naluri Yang Kuat, Mempesona\n" +
                "Nomor Keberuntungan: 8, 17, 22, 35, 39, 44\n" +
                "Aroma Keberuntungan: Peppermint, Kayu Pinus, Vanilla\n" +
                "Planet Yang Mengitari: Venus\n" +
                "Bunga Keberuntungan: Bunga Violet\n" +
                "Warna Keberuntungan: Biru\n" +
                "Batu Keberuntungan: Batu Pirus/Permata\n" +
                "Elemen Keberuntungan: Udara\n" +
                "Pasangan Serasi: Aries\n" +
                "Para libra sangat menawan, sulit ditebak, dan memiliki inteligensi yang tinggi; mereka dapat bekerja sama dan adil, namun penuh kebimbangan dan selalu mencari ketenangan batin. Mereka selalu kawatir pada hari ini dan selalu melakukan apapun juga untuk memenuhi kebutuhannya. Mereka suka bekerja sama daripada bekerja sendiri. Mereka haus akan pengetahuan dan memiliki minat yang besar pada bidang kehumasan dan kejiwaan. Mereka selau tampil sebagai pembawa damai dan jarang mudah marah, namun apabila marah, mereka dapat membuat orang di sekitarnya gemetar ketakutan. Cita rasa Libra klasik dan mereka menyukai kombinasi antara kesederhanaan dan kesempurnaan. Keragu-raguan mereka adalah langkah mundur terbesar bagi mereka. Tidak hanya membuat mereka kehilangan kesempatan tetapi juga membuat mereka yang berhubungan dengan Libra menjadi bingung. Mereka memiliki keinginan yang besar untuk menjaga segala sesuatunya tetap harmonis dan bersedia berkorban untuk mendapatkannya. Mereka mempunyai jiwa seni, keindahan, dan rencana. Ini semua membantu Libra dalam mencapai apa yang telah mereka tetapkan. Dalam menyelesaikan tugasnya, Libra selalu berhasil berkompromi dan membujuk orang lain untuk melakukan perbuatan sesuai dengan kehendaknya.\n" +
                "\n" +
                "Asmara para Libra: Para Libra akan mengerjakan apa saja demi memuaskan pasangannya. Mereka tertarik pada individual yang cantik/tampan. Para Libra tidak suka kata-kata kotor, penampilan yang sembrono atau prilaku buruk dari pasangannya. Para Libra tidak suka menyakiti orang lain. Keagungan, kemurahan hatinya dan pesonanya akan selalu menarik orang di dekatnya. Rasa aman yang didapatnya akan membuatnya bahagia."));
        list.add(new data(R.mipmap.scorpio, "Scorpio (24 Oktober - 22 November)", "Panjang Akal, Pendiam, Pendendam, Gigih, Tekun\n" +
                "Nomor Keberuntungan: 2, 9, 16, 27, 32, 47\n" +
                "Aroma Keberuntungan: Lada Hitam, Kopi, Kayu Pinus, Bunga Sedap Malam\n" +
                "Planet Yang Mengitari: Mars & Pluto\n" +
                "Bunga Keberuntungan: Tumbuh-Tumbuhan Yg Berduri\n" +
                "Warna Keberuntungan: Merah Tua\n" +
                "Batu Keberuntungan: Batu-Batuan Yang Berwarna Merah Darah\n" +
                "Elemen Keberuntungan: Air\n" +
                "Pasangan Serasi: Taurus\n" +
                "Para scorpio merupakan orang yang giat, emosional dan posesif. Mereka suka bekerja keras dan perfeksionis; mereka selalu melihat hidup dari sisi pahitnya. Mereka tidak menyukai kelemahan baik dalam diri mereka sendiri maupun dalam diri orang lain. Mereka sangat dermawan dan penuh kasih dan selalu membela kaum yang lemah. Mereka pandai menyimpan rahasia dan memiliki insting yang kuat. Daya tariknya ada pada tatapan matanya yang dapat menarik orang dengan kekuatan magnetiknya. Scorpio dapat menjadi orang yang setia, namun juga musuh yang berbahaya. Mereka pribadi yang penuh etika dan berpegang teguh pada peraturan yang mereka yakini dalam hidup mereka. Sikapnya yang penolong, setia membuat orang yang mengenalnya merasa beruntung berada di pihaknya. Jika kamu berada di pihak yang berlawanan dengannya, maka ia akan menjadi musuh yang pendendam dan kejam. Sedikit orang yang bisa menyadari kemampuan sejati scorpio karena sikapnya yang pendiam dan rendah hati terhadap apa yang telah mereka capai. Mereka orang yang selalu menepati janjinya dan jarang menarik kembali kata-kata yang telah terucap dari mulut mereka. Mereka pengamat yang cermat dan pandai mengukur situasi. Mereka tidak pernah terlibat dalam situasi tanpa persiapan yang matang, maka dari itu mereka selalu menjadi pesaing yang tangguh. Mereka selalu bersedia menolong yang lemah, penuh informasi dan pandai menjaga rahasia.\n" +
                "\n" +
                "Asmara para Scorpio: Scorpio adalah zodiak yang paling perasa. Mereka penuh gairah, setia dan sangat romantis. Mereka tidak akan terlibat dalam suatu hubungan tanpa penyelidikan terlebih dahulu untuk mengetahui apakah pilihannya itu merupakan pribadi yang setia dan jujur. Bila iya, maka ia akan menunjukkan sisi pribadi yang selama ini dia sembunyikan. Mereka sangat pencemburu jika menemukan sesuatu yang dicurigai tanpa alasan yang kuat. Tidak ada yang dapat menyakiti Scorpio kecuali perasaan dicurangi dan dikhianati oleh pasangannya."));
        list.add(new data(R.mipmap.sagitarius, "Sagitarius (23 November - 21 Desember)", "Berjiwa Petualang, Pandai, Suka Kebebasan, Mandiri, Pandai Berdiplomasi, Berpandangan Luas\n" +
                "Nomor Keberuntungan: 1, 12, 19, 25, 37, 46\n" +
                "Aroma Keberuntungan: Lemon, Kayu Oak, Bunga Pala, Bunga Rosemary, Cengkeh.\n" +
                "Planet Yang Mengitari: Jupiter\n" +
                "Bunga Keberuntungan: Bunga Melati, Bunga Anyer.\n" +
                "Warna Keberuntungan: Biru Violet, Ungu\n" +
                "Batu Keberuntungan: Batu Amethyst\n" +
                "Elemen Keberuntungan: Api\n" +
                "Pasangan Serasi: Gemini\n" +
                "Para sagitarius merupakan sosok yang jujur, terus terang, energik dan pandai membawa diri. Mereka mencapai tujuan karena memiliki pikiran yang positif, namun demikian ide-ide mereka sering kali sulit dimengerti. Mereka suka mengambil kesimpulan tanpa mengumpulkan fakta terlebih dahulu. Mereka memiliki wawasan yang luas, flexibel dan diplomatis. Keinginannya untuk berpetualang membawanya ke tempat yang jauh. Kaum Sagitarius dapat menjadi teman perjalanan yang menyenangkan karena pandai beradaptasi dengan lingkungan sekitar. Mereka pribadi mandiri. Sebagai teman seperjalanan, mereka penuh pesona dan menyenangkan. Walaupun uang saku mereka habis, namun mereka tidak pernah menyesalinya karena mereka menikmati apa yang telah mereka dapatkan. Sagitarius adalah pemula yang pandai membawa diri, selalu sedia menolong yang lain. Mereka membuat orang lain terinspirasi oleh antusiasme yang ada dalam pribadi mereka. Mereka suka menjadi pemimpin dan mudah tenar. Mereka suka bekerja di luar, asalkan nyaman dan penuh gaya. Mereka pesaing yang tangguh, suka bergabung di klub bergengsi. Sagitarius adalah jiwa yang bebas, menyenangkan dan mempunyai banyak teman.\n" +
                "\n" +
                "Asmara para Sagitarius: Sagitarius tidak suka komitmen, mereka takut terikat dan kehilangan kebebasannya. Mereka menjalin hubungan yang memungkinkan mereka untuk datang dan pergi sesuka hatinya. Namun bila mereka menemukan pasangan yang setuju dengan gaya hidupnya, mereka akan menghabiskan waktu bersama pasangannya selamanya. Sagitarius suka mencoba hal baru, demikian juga dalam hal bercinta. Mereka gemar mencoba dan akan cepat bosan bila bercinta di tempat yang sama."));
        list.add(new data(R.mipmap.capricorn, "Capricorn (22 Desember - 20 Januari)", "Pendiam, Rajin dan Ambisius, Materialis, Gengsi Tinggi, Suka Memerintah, Suka memperalat Orang Lain\n" +
                "Nomor Keberuntungan: 1, 12, 19, 25, 37, 46\n" +
                "Aroma Keberuntungan: Madu-Maduan, Tulip\n" +
                "Planet Yang Mengitari: Saturnus\n" +
                "Bunga Keberuntungan: Lumut, Tumbuhan Ivy (Merambat)\n" +
                "Warna Keberuntungan: Hitam, Coklat\n" +
                "Batu Keberuntungan: Mutiara Hitam\n" +
                "Elemen Keberuntungan: Tanah\n" +
                "Pasangan Serasi: Cancer\n" +
                "Para capricorn sangat teguh. Kambing jantan selalu berkeinginan untuk mencapai dan mengusahakan sesuatu. Mereka memiliki keinginan yang kuat dan biasa digunakan untuk mencapai rasa aman. Mereka sangat mantap dalam mengambil langkah seperti layaknya Kambing Gunung. Kapasitas kerja dan keyakinannya sangat besar. Mereka penuh waspada dan jarang meminta bantuan dari orang lain. Mereka suka mengerjakan segala sesuatunya sendiri. Mereka suka menjadi budak bagi diri mereka sendiri dan tidak percaya dengan orang lain dalam mengerjakan tugasnya. Pribadinya sangat sensitif dan sangat membutuhkan penghargaan dari orang lain. Capricorn memiliki kemantapan untuk mencapai tujuan. Pantang menyerah sampai titik darah penghabisan. Kemampuannya dalam hal berencana, digabung dengan kekuatan, stamina dan etika kerja yang kuat selalu membawa mereka menjadi pemenang. Sikapnya yang persuasif memudahkannya mendapatkan dukungan dari orang lain. Sagitarius termasuk materialis, namun tidak suka hidup berlebihan.\n" +
                "\n" +
                "Asmara para Capricorn: Cenderung sexy dan teguh dalam hal percintaan dan hubungan. Mereka tidak terima jawaban tidak. Jadi, jika kamu menjadi sasaran cintanya, berhati-hatilah. Mereka akan menyeretmu kehadapannya dengan kekuatan dan pesonanya. Cinta adalah suatu kebutuhan bagi zodiak ini dan begitu mereka mendapatkannya, mereka akan memperlakukannya bagaikan barang berharga. Capricorn sangat setia selama pasangannya selalu bersedia membantunya."));

        adapter koneksi = new adapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(koneksi);

    }
}