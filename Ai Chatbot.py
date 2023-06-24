import subprocess


def install_package(package):
    try:
        subprocess.check_call(['pip', 'install', package])
        print(f"Package {package} berhasil diinstal.")
    except subprocess.CalledProcessError as e:
        print(
            f"Error: Gagal menginstal package {package}. Kesalahan: {str(e)}")


dependencies = ['chatterbot']

for dependency in dependencies:
    install_package(dependency)
