package metier;

import dao.IDao;

public class MetierImpl implements Imetier {
    private IDao dao;
    @Override
    public double calcule() {
       double data = dao.getData();
       double res = data * 10;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
