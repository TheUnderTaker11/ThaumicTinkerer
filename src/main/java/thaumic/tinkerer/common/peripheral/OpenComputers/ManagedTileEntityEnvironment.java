package thaumic.tinkerer.common.peripheral.OpenComputers;

import li.cil.oc.api.Network;
import li.cil.oc.api.network.Visibility;
import li.cil.oc.api.prefab.ManagedEnvironment;

public class ManagedTileEntityEnvironment<T> extends ManagedEnvironment {

    protected final T tileEntity;

    public ManagedTileEntityEnvironment(final T tileEntity, final String name) {
        this.tileEntity = tileEntity;
        setNode(Network.newNode(this, Visibility.Network).withComponent(name).create());
    }
}
