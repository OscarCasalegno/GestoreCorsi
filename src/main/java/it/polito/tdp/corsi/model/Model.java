package it.polito.tdp.corsi.model;

import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.db.CorsoDAO;

public class Model {

    private CorsoDAO dao;

    public Model() {
        this.dao = new CorsoDAO();
    }

    public List<Corso> getCorsiByPeriodo(Integer pd) {
        return dao.getCorsiByPeriodo(pd);
    }

    public Map<Corso, Integer> getIscrittiByPeriodo(Integer pd) {
        return dao.getIscrittiByPeriodo(pd);
    }

    public List<Studente> getStudentiByCorso(Corso corso) {
        return dao.getStudentiByCorso(corso);
    }

    public boolean esisteCorso(String codins) {
        return dao.esisteCorso(codins);
    }

    public Map<String, Integer> getDivisioneCDS(Corso c) {
        /*
         * List<Studente> studenti = dao.getStudentiByCorso(c);
         * 
         * Map<String, Integer> statistiche = new HashMap<>();
         * 
         * for (Studente s : studenti) {
         * 
         * if (s.getCds() != null && !s.getCds().equals("")) { if
         * (statistiche.containsKey(s.getCds())) { statistiche.put(s.getCds(),
         * statistiche.get(s.getCds()) + 1); } else { statistiche.put(s.getCds(), 1); }
         * } }
         * 
         * return statistiche;
         */
        return dao.getDivisioneCDS(c);
    }

}
