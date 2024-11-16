package SistemFunction;

import java.time.LocalDate;

public class Tugas {
    private int idTugas;
    private String namaTugas;
    private String deskripsi;
    private LocalDate deadlineTugas;
    private String namaMatkul;
    private int prioritas;
    
    public Tugas(int idTugas, String namaTugas, String deskripsi, LocalDate deadlineTugas, String namaMatkul) {
        this.idTugas = idTugas;
        this.namaTugas = namaTugas;
        this.deskripsi = deskripsi;
        this.deadlineTugas = deadlineTugas;
        this.namaMatkul = namaMatkul;
        this.prioritas = 0; // Default prioritas adalah 0
    }
    
    // Getter dan Setter
    public int getIdTugas() {
        return idTugas;}

    public String getNamaTugas() {
        return namaTugas;}

    public String getDeskripsi() {
        return deskripsi;}

    public LocalDate getDeadlineTugas() {
        return deadlineTugas;}

    public String getNamaMatkul() {
        return namaMatkul;}

    public int getPrioritas() {
        return prioritas;}

    public void setPrioritas(int prioritas) {
        this.prioritas = prioritas;}
}
