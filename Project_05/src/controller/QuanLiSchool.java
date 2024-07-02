package controller;

import DoiTuong.Student;
import DoiTuong.Teacher;
import ThuVien.Book;
import ThuVien.Paper;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class QuanLiSchool {
    ArrayList<Student> student = new ArrayList<>();
    ArrayList<Teacher> teacher = new ArrayList<>(); 
    ArrayList<Book> book = new ArrayList<>();
    ArrayList<Paper> paper = new ArrayList<>();

    public static void main(String[] args) {
        QuanLiSchool qlsc = new QuanLiSchool();
        qlsc.student.add(new Student("SE18Dxx", "CNTT", "De180xxx", "Nguyen Van A", "Hoc Sinh", true));
        qlsc.teacher.add(new Teacher("Pro192", "Tien Si", "SE100000", "Tran Van Fun", "Giao Vien", true));
        qlsc.book.add(new Book("S122", "Pro Nang cao", "Mot Minh Tui", 100));
        qlsc.paper.add(new Paper("D12344", "Tai Lieu Thi PE", "Toi Khong Ro", 100));

        String[] menu = {
            "\n1. Them Hoc Sinh",
            "\n2. Them Giao Vien",
            "\n3. Them Book",
            "\n4. Them Tai Lieu",
            "\n5. In tat ca danh sach",
            "\n6. Hien thi tat ca sach hoac paper co trong thu vien",
            "\n0. Exit"
        };

        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println(Arrays.toString(menu));
            System.out.println("Nhap lua chon:");
            n = sc.nextInt();
            sc.nextLine();
            switch(n) {
                case 1:
                    qlsc.themHocSinh();
                    break;
                case 2:
                    qlsc.themGiaoVien();
                    break;
                case 3:
                    qlsc.themBook();
                    break;
                case 4:
                    qlsc.themPaper();
                    break;
                case 5:
                    qlsc.printAll();
                    break;
                case 6:
                    System.out.println("Chon 1 de in cac sach.\nChon 2 de in cac paper.");
                    int x;
                    System.out.println("Nhap lua chon:");
                    x = sc.nextInt();
                    sc.nextLine(); 
                    switch(x) {
                        case 1:
                            qlsc.printBook();
                            break;
                        case 2:
                            qlsc.printPaper();
                            break;
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        } while (n >= 0 && n < 7);
    }

    public void themHocSinh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hoc sinh:");
        String maHocSinh = sc.nextLine();
        
        System.out.println("Nhap ten cua hoc sinh:");
        String tenHocSinh = sc.nextLine();
        
        System.out.println("Nhap gioi tinh hoc sinh (true: Nam, false: Nu):");
        boolean gioiTinh = sc.nextBoolean();
        sc.nextLine(); 
        
        System.out.println("Nhap lop cua hoc sinh:");
        String lopHocSinh = sc.nextLine();
        
        System.out.println("Nhap ban cua hoc sinh:");
        String banHocSinh = sc.nextLine();
        
        Student std1 = new Student(lopHocSinh, banHocSinh, maHocSinh, tenHocSinh, "Hoc Sinh", gioiTinh);
        student.add(std1);
        
        System.out.println("Them Hoc Sinh Thanh Cong");
    }

    public void themGiaoVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma Giao Vien:");
        String maGiaoVien = sc.nextLine();
        
        System.out.println("Nhap ten cua Giao Vien:");
        String tenGiaoVien = sc.nextLine();
        
        System.out.println("Nhap gioi tinh Giao Vien (true: Nam, false: Nu):");
        boolean gioiTinh = sc.nextBoolean();
        sc.nextLine(); 
        
        System.out.println("Nhap mon day cua giao vien:");
        String monday = sc.nextLine();
        
        System.out.println("Nhap trinh do cua Giao Vien:");
        String trinhdo = sc.nextLine();
        
        Teacher gv1 = new Teacher(monday, trinhdo, maGiaoVien, tenGiaoVien, "Giao Vien", gioiTinh);
        teacher.add(gv1);
        
        System.out.println("Them Giao Vien Thanh Cong");
    }

    public void themBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma Tai Lieu:");
        String maBook = sc.nextLine();
        
        System.out.println("Nhap ten Tai Lieu:");
        String tenBook = sc.nextLine();
        
        System.out.println("Nhap ten nha xuat ban:");
        String tenNXB = sc.nextLine();
        
        System.out.println("Nhap so trang:");
        int soTrang = sc.nextInt();
        
        Book bo1 = new Book(maBook, tenBook, tenNXB, soTrang);
        book.add(bo1);
        
        System.out.println("Them Sach Thanh Cong");
    }

    public void themPaper() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma Tai Lieu:");
        String maTL = sc.nextLine();
        
        System.out.println("Nhap ten Tai Lieu:");
        String tenTL = sc.nextLine();
        
        System.out.println("Nhap ten nha xuat ban:");
        String tenNXB = sc.nextLine();
        
        System.out.println("Nhap tai ban:");
        int taiBan = sc.nextInt();
        
        Paper pp1 = new Paper(maTL, tenTL, tenNXB, taiBan);
        paper.add(pp1);
        
        System.out.println("Them Tai Lieu Thanh Cong");
    }

    public void printAll() {
        for (Student std : student) {
            System.out.println(std);
        }
        
        for (Teacher tc : teacher) {
            System.out.println(tc);
        }
        
        for (Book bo : book) {
            System.out.println(bo);
        }
        
        for (Paper pp : paper) {
            System.out.println(pp);
        }
    }

    public void printBook() {
        for (Book bo : book) {
            System.out.println(bo);
        }
    }

    public void printPaper() {
        for (Paper pp : paper) {
            System.out.println(pp);
        }
    }
}
