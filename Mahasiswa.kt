data class Mahasiswa(
    val nama: String,
    val umur: Int,
    val asalSekolah: String,
    val nilaiMat: Int,
    val nilaiIndo: Int,
    val nilaiIng: Int
) {
    fun hitungRataRata(): Int {
        return (nilaiMat + nilaiIndo + nilaiIng) / 3
    }

    fun rekomendasiJurusan(): String {
        val rata = hitungRataRata()
        return when {
            rata >= 85 -> "Teknik Informatika"
            rata >= 75 -> "Sistem Informasi"
            rata >= 65 -> "Manajemen Bisnis"
            else -> "Nilai tidak mencukupi"
        }
    }

    override fun toString(): String {
        return """
            Nama: $nama
            Umur: $umur
            Asal Sekolah: $asalSekolah
            Nilai:
              - Matematika: $nilaiMat
              - Bahasa Indonesia: $nilaiIndo
              - Bahasa Inggris: $nilaiIng
            Rata-rata: ${hitungRataRata()}
            Rekomendasi Jurusan: ${rekomendasiJurusan()}
        """.trimIndent()
    }
}