fun main() {
    val daftarMahasiswa = mutableListOf<Mahasiswa>()

    while (true) {
        println("\n=== MENU UTAMA ===")
        println("1. Daftar Mahasiswa")
        println("2. Lihat Daftar Mahasiswa")
        println("3. Keluar")
        print("Pilih menu (1-3): ")
        when (readLine()) {
            "1" -> {
                do {
                    print("Nama: ")
                    val nama = readLine() ?: ""
                    print("Umur: ")
                    val umur = readLine()?.toIntOrNull() ?: 0
                    print("Asal Sekolah: ")
                    val asal = readLine() ?: ""

                    println("\nMasukkan nilai mata pelajaran:")
                    print("Matematika: ")
                    val nilaiMat = readLine()?.toIntOrNull() ?: 0
                    print("Bahasa Indonesia: ")
                    val nilaiIndo = readLine()?.toIntOrNull() ?: 0
                    print("Bahasa Inggris: ")
                    val nilaiIng = readLine()?.toIntOrNull() ?: 0

                    val mahasiswa = Mahasiswa(nama, umur, asal, nilaiMat, nilaiIndo, nilaiIng)
                    daftarMahasiswa.add(mahasiswa)

                    println("\nMahasiswa berhasil didaftarkan!")
                    print("\nApakah Anda ingin menginputkan mahasiswa lagi? (y/n): ")
                    val lagi = readLine()?.lowercase() ?: "n"
                } while (lagi == "y")
            }

            "2" -> {
                println("\n=== DAFTAR MAHASISWA TERDAFTAR ===")
                if (daftarMahasiswa.isEmpty()) {
                    println("Belum ada mahasiswa.")
                } else {
                    for ((index, mahasiswa) in daftarMahasiswa.withIndex()) {
                        println("\nMahasiswa ke-${index + 1}")
                        println(mahasiswa)
                    }
                }
            }

            "3" -> {
                println("Terima kasih telah menggunakan program ini.")
                break
            }

            else -> println("Pilihan tidak valid.")
        }
    }
}