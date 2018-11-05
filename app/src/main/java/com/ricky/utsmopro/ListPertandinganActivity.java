package com.ricky.utsmopro;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;

import java.util.LinkedList;

public class ListPertandinganActivity extends AppCompatActivity {

    private final LinkedList<ModelPertandingan> listPertandingan = new LinkedList<>();

    private RecyclerView mRecyclerView;
    private ListPertandinganAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pertandingan);

        //set data
        listPertandingan.addLast(new ModelPertandingan(
                "Persija",
                " Persib", R.drawable.persija, R.drawable.persib,
                "PT. Liga Indonesia Baru (LIB) belum memutuskan secara resmi status pertandingan Persib Bandung kontra Persija Jakarta. \n" + "\n" + "Namun melalui laman resmi LIB pertandingan Persib vs Persib sudah terdapat tulisan \"Ditunda\" dan waktu pertandingan tertulis Selasa 25 September 2018. "));
        listPertandingan.addLast(new ModelPertandingan(
                "Psms",
                "Arema", R.drawable.psms, R.drawable.arema,
                "KOMPAS.com - Arema FC berhasil menang atas PSMS Medan dengan skor meyakinkan, 5-0, pada pertandingan pekan ke-28 Liga 1 2018 yang digelar di Stadion Kanjuruhan, Minggu (28/10/2018). Gol-gol Arema FC ke gawang PSMS dicetak oleh Dedik Setiawan (8'), Makan Konate (12' dan 39'), Dendi Santoso (23'), dan Nur Hardianto (80').\n" +
                        "\n"));
        listPertandingan.addLast(new ModelPertandingan(
                "Psm",
                "Persipura", R.drawable.psm, R.drawable.persipura,
                "KOMPAS.com - PSM Makassar berhasil mengalahkan Persipura Jayapura dalam drama enam gol (4-2) pada pekan ke-29 Liga 1 di Stadion Andi Matalatta, Minggu (4/11/2018). Tertinggal 1-2 hingga menit ke-79', PSM bangkit pada 10 menit akhir laga dengan mencetak tiga gol. Empat gol kemenangan PSM dicetak oleh Wiljan Pluim pada menit ke-12, M Syamsuddin Rachmat (80'), Ferdinand Sinaga (82'), dan Alessandro Ferreira (89'). Adapun dua gol Persipura Jayapura dicetak oleh brace kapten tim, Boaz Solossa (26', 58').\n"));
        listPertandingan.addLast(new ModelPertandingan(
                "Bali United",
                "Persebaya", R.drawable.bali, R.drawable.persebaya,
                "Liputan6.com, Surabaya - Persebaya Surabaya berhasil mengakhiri rekor tanpa kemenangan dalam lima partai terakhir Go-Jek Liga 1 bersama Bukalapak berkat keunggulan 1-0 atas Bali United di Stadion Gelora Bung Tomo (GBT), Sabtu (7/7/2018). Gol tunggal kemenangan tim berjuluk Bajul Ijo itu dibukukan oleh Irfan Jaya di menit ke-82.\n" +
                        "\n" +
                        "Laga berjalan cepat. Persebaya langsung mengambil alih jalannya pertandingan. Namun, Bali United berani meladeni permainan tuan rumah.\n" +
                        "\n" +
                        "Baik Persebaya dan Bali United saling bergantian membangun serangan. Tapi, berbagai upaya masih dapat diredam oleh lini belakang masing-masing tim."));
        listPertandingan.addLast(new ModelPertandingan(
                "Mu",
                "Persela", R.drawable.madura, R.drawable.persela,
                "Lamongan - Laga derby Jawa Timur antara Persela Lamongan vs Madura United berakhir tanpa pemenang. Kedua tim mengakhiri laga dengan skor imbang 1-1.\n" +
                        "\n" +
                        "Persela menjamu Madura United dalam pertandingan pekan ke-17 Liga 1 2018 di Stadion Surajaya, Lamongan, Jawa Timur, Senin (23/7). Tuan rumah sukses memimpin lebih dulu.\n" +
                        "\n" +
                        "Di menit ke-11, Fahmi Al-Ayyubi sukses menanduk bola sepak pojok Guntur Triaji. Persela unggul 1-0, seraya mengakhiri catatan clean sheet Madura United di tiga laga terakhir."));

        mRecyclerView = (RecyclerView) findViewById(R.id.list_pertandingan_cyc);

        mAdapter = new ListPertandinganAdapter(ListPertandinganActivity.this, listPertandingan);

        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nav_bar, menu);
        return true;
    }
}

