require recipes-multimedia/${BPN}/${BPN}.inc

HOMEPAGE = "https://github.com/libass/libass"
SRC_URI = "https://github.com/libass/libass/releases/download/${PV}/libass-${PV}.tar.xz"
SRC_URI[md5sum] = "1c8cbd5751aeb192bda04a65d0464fd9"
SRC_URI[sha256sum] = "d698d0a6adca7c36c5a86b540d67b05bfd36cebc3c351ab7646497c43fe1face"

# See https://github.com/libass/libass/pull/197, which removed ENCA support
EXTRA_OECONF_remove = "--enable-enca"
