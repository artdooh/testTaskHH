package dooh.hh.test3;

import java.util.Date;

/**
 * Представим, что в некотором абстрактном складском приложении смартфоны представлены классом SmartPhone
 * Содерджит ли класс SmartPhone какие-либо ошибки?
 */

public class SmartPhone {
    private String model;
    private Date date;
    private String revision;

    public  SmartPhone(String model, Date date, String revision) {
        this.model = model;
        this.date = date;
        this.revision = revision;
    }

    @Override
    public int hashCode() {
        int hash = 31;
        hash = hash * 17 + (model == null ? 0 : model.hashCode());
        hash = hash * 17 + (date == null ? 0 : date.hashCode());
        hash = hash * 17 + (revision == null ? 0 : revision.hashCode());
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmartPhone)) return false;
        SmartPhone that = (SmartPhone) o;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (revision != null ? !revision.equals(that.revision) : that.revision != null) return false;

        return true;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

}
