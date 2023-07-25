package com.example.Lab5_8.repository;


import com.example.Lab5_8.entity.GiangVien;
import com.example.Lab5_8.until.HibernateUtil;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class GiangVienRepository {

    public List<GiangVien> getAll() {
        List<GiangVien> lists = new ArrayList<>();
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("FROM GiangVien", GiangVien.class);
            lists = (ArrayList<GiangVien>) query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lists;
    }

    public GiangVien getOne(String ma) {
        GiangVien giangVien = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("FROM GiangVien WHERE ma =:ma", GiangVien.class);
            query.setParameter("ma", ma);
            giangVien = (GiangVien) query.getSingleResult();
        }
        return giangVien;
    }

    public Boolean add(GiangVien giangVien) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(giangVien);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean update(GiangVien giangVien) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.merge(giangVien);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean delete(GiangVien giangVien) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(giangVien);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new GiangVienRepository().getAll());
    }

}
