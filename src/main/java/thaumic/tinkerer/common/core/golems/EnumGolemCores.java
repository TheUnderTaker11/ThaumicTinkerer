package thaumic.tinkerer.common.core.golems;

public enum EnumGolemCores {

    CoreFill((byte) 0, "item.ItemGolemCore.0.name"),
    CoreEmpty((byte) 1, "item.ItemGolemCore.1.name"),
    CoreGather((byte) 2, "item.ItemGolemCore.2.name"),
    CoreHarvest((byte) 3, "item.ItemGolemCore.3.name"),
    CoreGuard((byte) 4, "item.ItemGolemCore.4.name"),
    CoreDecanting((byte) 5, "item.ItemGolemCore.5.name"),
    CoreAlcemy((byte) 6, "item.ItemGolemCore.6.name"),
    CoreChop((byte) 7, "item.ItemGolemCore.7.name"),
    CoreUse((byte) 8, "item.ItemGolemCore.8.name"),
    CoreButcher((byte) 9, "item.ItemGolemCore.9.name"),
    CoreSorting((byte) 10, "item.ItemGolemCore.10.name"),
    CoreFishing((byte) 11, "item.ItemGolemCore.11.name"),
    CoreBlank((byte) 100, "item.ItemGolemCore.100.name"),;

    private String name;
    private byte coreByte;

    EnumGolemCores(byte ch, String name) {
        coreByte = ch;
        this.name = name;
    }

    public static EnumGolemCores getFromByte(byte core) {
        switch (core) {
            case 0:
                return CoreFill;
            case 1:
                return CoreEmpty;
            case 2:
                return CoreGather;
            case 3:
                return CoreHarvest;
            case 4:
                return CoreGuard;
            case 5:
                return CoreDecanting;
            case 6:
                return CoreAlcemy;
            case 7:
                return CoreChop;
            case 8:
                return CoreUse;
            case 9:
                return CoreButcher;
            case 10:
                return CoreSorting;
            case 11:
                return CoreFishing;
            case 100:
                return CoreBlank;
            default:
                return null;
        }
    }

    public String getName() {
        return name;
    }

    public byte getChar() {
        return coreByte;
    }
}
