package com.necro.farmacia.farmacyMedicine.domain;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class FarmacyMedicineId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idMedicine;
    private Long idFarmacy;

    public FarmacyMedicineId() {
    }

    public FarmacyMedicineId(Long idMedicine, Long idFarmacy) {
        this.idMedicine = idMedicine;
        this.idFarmacy = idFarmacy;
    }

    public Long getIdMedicine() {
        return idMedicine;
    }

    public void setIdMedicine(Long idMedicine) {
        this.idMedicine = idMedicine;
    }

    public Long getIdFarmacy() {
        return idFarmacy;
    }

    public void setIdFarmacy(Long idFarmacy) {
        this.idFarmacy = idFarmacy;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idMedicine == null) ? 0 : idMedicine.hashCode());
        result = prime * result + ((idFarmacy == null) ? 0 : idFarmacy.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FarmacyMedicineId other = (FarmacyMedicineId) obj;
        if (idMedicine == null) {
            if (other.idMedicine != null)
                return false;
        } else if (!idMedicine.equals(other.idMedicine))
            return false;
        if (idFarmacy == null) {
            if (other.idFarmacy != null)
                return false;
        } else if (!idFarmacy.equals(other.idFarmacy))
            return false;
        return true;
    }

}
