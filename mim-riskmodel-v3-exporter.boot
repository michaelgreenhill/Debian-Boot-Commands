setparams 'Install' 
set background_color=black 
linux /install.amd/vmlinuz \
auto=true \
netcfg/disable_dhcp=true \
netcfg/confirm_static=true \
netcfg/get_ipaddress=10.20.12.74 \
netcfg/get_netmask=255.255.255.0 \
netcfg/get_gateway=10.20.12.1 \
netcfg/get_nameservers=192.168.1.16 192.168.1.17 \
url=http://10.20.13.101/preseed/debian-9.5-generalised-partitioned.cfg \
hostname=mim-riskmodel-v3-exporter \
domain=makeitmine.local \
interface=auto \
vga=788 noprompt --- quiet
initrd /install.amd/gtk/initrd.gz 
boot
