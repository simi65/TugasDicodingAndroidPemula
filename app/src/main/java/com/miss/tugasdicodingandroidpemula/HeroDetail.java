package com.miss.tugasdicodingandroidpemula;

import java.util.ArrayList;

public class HeroDetail {

    private static String[] idTokoh = {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10"


    };


    private static String[]  heroNames = {
            "1. Abdul Somad",
            "2. Khalid Basalamah",
            "3. syafiqrizabasalamah",
            "4. Zakir Naik",
            "5. syekh utsaimin",
            "6. syekh Ali Jaber",
            "7. Adi Hidayat",
            "8. ustadz hanan attaki",
            "9. syekh sudais",
            "10. abdul basit"
    };

    private static String[] heroDetails = {
            "Ustaz Abdul Somad Batubara, Lc., D.E.S.A., Datuk Seri Ulama Setia Negara atau lebih dikenal dengan Ustaz Abdul Somad adalah seorang pendakwah dan ulama Indonesia yang sering mengulas berbagai macam persoalan agama, khususnya kajian ilmu hadis dan Ilmu fikih.",
            "Dr. Khalid Zeed Abdullah Basalamah, Lc., M.A. atau lebih dikenal Khalid Basalamah adalah seorang pendakwah Indonesia yang berasal dari Makassar, Sulawesi Selatan.",
            "PROFIL ustad SRB ( Syafiq Riza Basalamah)Mempunyai nama lengkap Syafiq Riza bin Hasan bin Abdul Qadir bin Salim Basalamah Gelar dokter ustad Syafiq dari Univercity Of Madinah dengan gilang gemilang dan tanpa adanya masalah sama sekali Profil dan biodata Ustadz Syafiq Riza Basalamah adalah salah satu diantara sekian banyak mahasiswa Indonesia yang memiliki nilai fantastis dalam Univercity Of Madinah atau Universitas Madinah. Lulus dengan nilai SUMMA CUMLAUDE yang artinya nilai sempurna dalam setiap mata pelajaran.",
            "Zakir Abdul Karim Naik adalah seorang dai, doktor, pakar ilmu perbandingan agama, pembicara umum, dan penceramah internasional Muslim dari India. Ia juga merupakan penulis hal-hal tentang Islam dan Ilmu Perbandingan Agama",
            "Syaikh Abu 'Abdullah Muhammad bin Shalih bin Muhammad bin Sulaiman bin Abdur Rahman Al-'Utsaimin At-Tamimi adalah seorang ulama era kontemporer yang ahli dalam sains fiqh. Lebih dikenal dengan nama Syaikh Ibn 'Utsaimin atau Syaikh 'Utsaimin. Dilahirkan di kota Unaizah pada tahun 1928.",
            "Ali Saleh Mohammed Ali Jaber atau yang lebih dikenal dengan Syekh Ali Jaber adalah Pendakwah dan Ulama berkewarganegaraan Indonesia. Ia juga menjadi juri pada Hafiz Indonesia dan menjadi Da'i dalam berbagai kajian di berbagai stasiun televisi nasional. ",
            "Ustadz Adi Hidayat, Lc., MA. adalah ulama asal Indonesia yang dapat menguasai isi kitab suci Alquran beserta letak barisnya. Selain itu, ia juga menguasai ilmu hadist dan berbagai kitab agama beserta makna dan posisinya",
            "Profil dan Biografi Ustadz Hanan Attaki. Penceramah asal Aceh ini namanya tengah naik daun di masyarakat. Hanan Attaki yang dikenal sebagai pendiri atau founder pemuda hijrah ini ceramah-ceramahnya yang banyak beredar di Youtube sukses di tonton oleh banyak netizen atau masyarakat.",
            "Prof. Dr. Asy-Syaikh Abdurrahman bin Abdul Aziz bin Muhammad as-Sudais atau lebih dikenal dengan Abdurrahman as-Sudais adalah Imam dan Khatib Masjidil Haram yang juga menjabat sebagai Ketua Umum Pengurus Masjidil Haram dan Masjid Nabawi.",
            "Sheikh Abdul Basit 'Abd us-Samad (1 Januari 1927-1988) (Bahasa Arab: عبد الباسط عبد الصمد), adalah Qari yang terkenal. Dia adalah satu-satunya Qari yang memenangkan tiga pertandingan Qari di seluruh dunia pada awal 1970-an. Abd al-Samad adalah salah satu penjual Hafiz pertama yang membaca, dan presiden pertama Masyarakat Qari di Mesir. Dia terkenal karena pembacaan Surah Al-Fatihah, bab pertama Al-Qur'an, dan bab utama dari shalat lima waktu"


    };

    private static int[] heroesImages = {
            R.drawable.abdulsomad,
            R.drawable.khalidbasalamah,
            R.drawable.syafiqbasalamah,
            R.drawable.dzakirnaik,
            R.drawable.utsaimin,
            R.drawable.syekhalijaber,
            R.drawable.adihidayad,
            R.drawable.hananataki,
            R.drawable.sudais,
            R.drawable.abdulbasit
    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setIdTokoh(idTokoh[position]);
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }

}
