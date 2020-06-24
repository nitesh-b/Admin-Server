/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hills.data;

/**
 *
 * @author nitesh.banskota
 */
public class FullProductDetails {
    private String ItemSupplier, sysid, ItemProductSubGroup, ItemStatusNZ,ItemSKU, ItemSerialised;
    private String ItemStatusHCSKIBO, ItemHCSDescription,ItemManufPartNumber, ItemName,ItemSellingCountry;
    private String ItemUOM, ItemStausAU;

    public FullProductDetails() {
    }

    public FullProductDetails(String ItemSupplier, String sysid, String ItemProductSubGroup, String ItemStatusNZ, String ItemSKU, String ItemSerialised, String ItemStatusHCSKIBO, String ItemHCSDescription, String ItemManufPartNumber, String ItemName, String ItemSellingCountry, String ItemUOM, String ItemStausAU) {
        this.ItemSupplier = ItemSupplier;
        this.sysid = sysid;
        this.ItemProductSubGroup = ItemProductSubGroup;
        this.ItemStatusNZ = ItemStatusNZ;
        this.ItemSKU = ItemSKU;
        this.ItemSerialised = ItemSerialised;
        this.ItemStatusHCSKIBO = ItemStatusHCSKIBO;
        this.ItemHCSDescription = ItemHCSDescription;
        this.ItemManufPartNumber = ItemManufPartNumber;
        this.ItemName = ItemName;
        this.ItemSellingCountry = ItemSellingCountry;
        this.ItemUOM = ItemUOM;
        this.ItemStausAU = ItemStausAU;
    }

    public String getItemSupplier() {
        return ItemSupplier;
    }

    public String getSysid() {
        return sysid;
    }

    public String getItemProductSubGroup() {
        return ItemProductSubGroup;
    }

    public String getItemStatusNZ() {
        return ItemStatusNZ;
    }

    public String getItemSKU() {
        return ItemSKU;
    }

    public String getItemSerialised() {
        return ItemSerialised;
    }

    public String getItemStatusHCSKIBO() {
        return ItemStatusHCSKIBO;
    }

    public String getItemHCSDescription() {
        return ItemHCSDescription;
    }

    public String getItemManufPartNumber() {
        return ItemManufPartNumber;
    }

    public String getItemName() {
        return ItemName;
    }

    public String getItemSellingCountry() {
        return ItemSellingCountry;
    }

    public String getItemUOM() {
        return ItemUOM;
    }

    public String getItemStausAU() {
        return ItemStausAU;
    }
    
    
    
}
